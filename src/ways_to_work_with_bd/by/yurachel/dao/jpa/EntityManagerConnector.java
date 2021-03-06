package ways_to_work_with_bd.by.yurachel.dao.jpa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ways_to_work_with_bd.by.yurachel.dao.hibernate.SessionFactoryContainer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerConnector {
    private static final Logger LOGGER = LogManager.getLogger(SessionFactoryContainer.class);
    private EntityManager entityManager;

    private EntityManagerConnector() {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("PhoneDB");
        try {
            entityManager = emf.createEntityManager();
            LOGGER.info("Entity manager was successfully created");
        } catch (Exception e) {
            LOGGER.error("Entity manager wasn't successfully created {}", e.getMessage());
            throw new Error("Error in entityManager creating. ", e);

        }
    }

    public static EntityManager getInstance() {
        return EntityManagerHolder.instance.entityManager;
    }

    private static class EntityManagerHolder {
        static EntityManagerConnector instance = new EntityManagerConnector();
    }
}
