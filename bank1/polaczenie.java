package bank1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class polaczenie {

    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(pracownik.class)
                    .addAnnotatedClass(klient.class).addAnnotatedClass(konto.class).buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
