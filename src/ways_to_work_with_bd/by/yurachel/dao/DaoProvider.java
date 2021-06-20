package ways_to_work_with_bd.by.yurachel.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ways_to_work_with_bd.by.yurachel.dao.hibernate.impl.HibernateDao;
import ways_to_work_with_bd.by.yurachel.dao.jdbc.impl.JdbcDao;
import ways_to_work_with_bd.by.yurachel.dao.jpa.impl.JpaDao;
import ways_to_work_with_bd.by.yurachel.model.Phone;

import java.util.Locale;

public final class DaoProvider {
    private static IDao<Phone> IPhoneDAO;
    private static DaoType type;
    private static final Logger LOGGER = LogManager.getLogger(DaoProvider.class);

    public static void init(String db) {
        type = DaoType.valueOf(db.toUpperCase(Locale.ROOT));

        switch (type) {
            case JPA:
                IPhoneDAO = new JpaDao();
                LOGGER.info("JPA dao was initialized.");
                break;
            case JDBC:
                IPhoneDAO = new JdbcDao();
                LOGGER.info("JDBC dao was initialized.");
                break;
            case HIBERNATE:
                IPhoneDAO = new HibernateDao();
                LOGGER.info("Hibernate dao was initialized.");
                break;
            default:
                LOGGER.info("Initialized was with error.");
        }
    }

    public static class DAOProviderHolder {

        public static final DaoProvider INSTANCE = new DaoProvider();
    }

    private DaoProvider() {

    }

    public static DaoProvider getInstance() {
        return DAOProviderHolder.INSTANCE;
    }

    public IDao<Phone> getIPhoneDAO() {
        return IPhoneDAO;
    }
}
