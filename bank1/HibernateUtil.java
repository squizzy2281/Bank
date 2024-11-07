package bank1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {

            return new Configuration().configure("hibernate.cfg.xml") // Ładowanie konfiguracji
                    .addAnnotatedClass(klient.class) // Dodaj klasy encji
                    .addAnnotatedClass(konto.class)
                    .buildSessionFactory();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new ExceptionInInitializerError("Sesja Hibernate nie została utworzona.");
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close(); // Zamyka fabrykę sesji
    }
}
