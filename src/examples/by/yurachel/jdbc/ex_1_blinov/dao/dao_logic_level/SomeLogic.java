package examples.by.yurachel.jdbc.ex_1_blinov.dao.dao_logic_level;

import examples.by.yurachel.jdbc.ex_1_blinov.dao.dao_method_level.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;

/* Схематически применение этого подхода можно увидеть в методе doLogic().
 * */
public class SomeLogic {

    public void doLogic(int id) throws SQLException {
        //создание-получение соединения.
        Connection connection = ConnectionPool.getConnection();

        //Открытие транзакции.
        connection.setAutoCommit(false);

        //Инициализация необходимых экземпляров DAO.
        AbonentDAO abonent = new AbonentDAO(connection);
        PaymentDAO payment = new PaymentDAO(connection);

        //Выполнение запросов.
        abonent.findALL();
        payment.findEntityById(id);
        payment.delete(id);

        //Акрытие транзакции.
        connection.commit();

        //Закрытие-возвращение соединения.

        ConnectionPool.close(connection);
    }

}
