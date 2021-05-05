package examples.by.yurachel.jdbc.ex_1_blinov.dao.dao_logic_level;

import examples.by.yurachel.jdbc.ex_1_blinov.entity.Entity;

import java.sql.Connection;
import java.util.List;

public class PaymentDAO extends AbstractDAO<Entity>{

    public PaymentDAO(Connection connection) {
        super(connection);
    }
// Реализация методов.
    @Override
    public List<Entity> findALL() {
        return null;
    }

    @Override
    public Entity findEntityById(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean delete(Entity entity) {
        return false;
    }

    @Override
    public boolean create(Entity entity) {
        return false;
    }

    @Override
    public Entity update(Entity entity) {
        return null;
    }
}
