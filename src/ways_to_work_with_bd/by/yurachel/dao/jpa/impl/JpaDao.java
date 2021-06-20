package ways_to_work_with_bd.by.yurachel.dao.jpa.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ways_to_work_with_bd.by.yurachel.dao.IDao;
import ways_to_work_with_bd.by.yurachel.dao.jpa.EntityManagerConnector;
import ways_to_work_with_bd.by.yurachel.model.Phone;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class JpaDao implements IDao<Phone> {
    private static final Logger LOGGER = LogManager.getLogger(JpaDao.class);
    private static final EntityManager entityManager =
            EntityManagerConnector.getInstance();

    @Override
    public List findAll() {
        entityManager.getTransaction().begin();
        List phones = entityManager.createQuery("from Phone")
                .getResultList();
        entityManager.getTransaction().commit();
        return phones;
    }

    @Override
    public Phone findById(long id) {
        throw new UnsupportedOperationException("Unsupported operation.");
    }

    @Override
    public boolean removeById(long id) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("from Phone where id=:id");
        query.setParameter("id", id);
        Phone phone = (Phone) query.getSingleResult();
        if (phone == null) {
            return false;
        }
        entityManager.remove(phone);
        entityManager.getTransaction().commit();
        return true;
    }

    @Override

    public boolean updateById(long id, Phone object) {
        entityManager.getTransaction().begin();
        try {
            Query query = entityManager.createQuery("from Phone where id=:id");
            query.setParameter("id", id);
            Phone phone = (Phone) query.getSingleResult();
            phone.setName(object.getName());
            phone.setPrice(object.getPrice());
            phone.setProcessor(object.getProcessor());
            phone.setImg(object.getImg());
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            LOGGER.error("Update operation wasn't success {}", e.getMessage());
        }
        return false;
    }

    @Override
    public boolean create(Phone object) {
        entityManager.getTransaction().begin();
        try {
            entityManager.persist(object);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            LOGGER.error(("Create operation wasn't success {}"), e.getMessage());
        }
        return false;
    }

    @Override
    public Phone findByName(String objectName) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("from Phone where name=:name");
        query.setParameter("name", objectName);
        Phone phone = (Phone) query.getSingleResult();
        entityManager.getTransaction().commit();

        return phone;
    }
}
