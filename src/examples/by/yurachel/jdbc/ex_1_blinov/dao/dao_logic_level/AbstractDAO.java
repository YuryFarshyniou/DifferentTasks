package examples.by.yurachel.jdbc.ex_1_blinov.dao.dao_logic_level;

import examples.by.yurachel.jdbc.ex_1_blinov.entity.Entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/* На практике чаще всего возникает необходимость при выполнении запроса пользователя обращаться сразу к нескольким
ветвям DAO и использовать при этом единственное соединение с БД. В этом случае соединение с БД создается или
извлекается из пула до создания экземпляров DAO,а закрывается , соответственно, после выполнения всех обращений.
* */
public abstract class AbstractDAO<T extends Entity> {
    protected Connection connection;

    public AbstractDAO(Connection connection) {
        this.connection = connection;

    }

    public abstract List<T> findALL();

    public abstract T findEntityById(int id);

    public abstract boolean delete(int id);

    public abstract boolean delete(T entity);

    public abstract boolean create(T entity);

    public abstract T update(T entity);

    public void close(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
