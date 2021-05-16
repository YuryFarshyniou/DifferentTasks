package examples.by.yurachel.blinov.jdbc.dao.dao_logic_level;

import examples.by.yurachel.blinov.jdbc.entity.Entity;

import java.sql.Connection;
import java.util.List;

public class AbonentDAO  extends AbstractDAO{
    public AbonentDAO(Connection connection) {
        super(connection);
    }
// Реализация методов.
    @Override
    public List findALL() {
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
