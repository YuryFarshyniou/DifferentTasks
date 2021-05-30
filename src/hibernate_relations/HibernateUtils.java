package hibernate_relations;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();

        } catch (Throwable Ex) {
            // Make wire you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + Ex);
            throw new ExceptionInInitializerError(Ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
