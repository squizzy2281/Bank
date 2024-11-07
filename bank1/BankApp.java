package bank1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BankApp {

    public static void main(String[] args) {
        // Uzyskanie sesji Hibernate
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        Transaction transaction = null;

        try {
            // Rozpoczęcie transakcji
            transaction = session.beginTransaction();

            // Tworzenie klienta
            klient klient = new klient();
            klient.setImie("Jan");
            klient.setNazwisko("Kowalski");

            // Tworzenie konta
            konto konto = new konto();
            konto.setSaldo(5000.0);
            konto.setKlient(klient);  // Powiązanie konta z klientem

            // Zapisanie klienta i konta w bazie danych
            session.save(klient);
            session.save(konto);

            // Zatwierdzenie transakcji
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // W razie błędu, cofamy transakcję
            }
            e.printStackTrace();
        } finally {
            // Zamykamy sesję Hibernate
            sessionFactory.close();
        }
    }
}
