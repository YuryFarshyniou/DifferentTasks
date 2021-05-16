package examples.by.yurachel.blinov.jdbc.main;

import examples.by.yurachel.blinov.jdbc.dao.ConnectorDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchMain {
    /* В JDBC существует механизм batch-команд,который позволяет запускать на исполнение в БД массив запросов SQL вместе,как одну единицу.

    * */

    public static void main(String[] args) {

        try (Connection cn = ConnectorDB.getConnection();
             Statement statement = cn.createStatement()) {
            cn.setAutoCommit(false);
            statement.addBatch("INSERT INTO phonebook VALUES(31,'Horus',1232451)");
            statement.addBatch("INSERT INTO phonebook VALUES(67,'Abbadon',1412451)");
            statement.addBatch("INSERT INTO phonebook VALUES(98,'Dorn',1232781)");
            statement.executeBatch();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
