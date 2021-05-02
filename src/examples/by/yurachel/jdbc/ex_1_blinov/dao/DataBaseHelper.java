package examples.by.yurachel.jdbc.ex_1_blinov.dao;

import examples.by.yurachel.jdbc.ex_1_blinov.entity.Abonent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHelper {
    private final static String SQL_INSERT = "INSERT INTO phonebook(idphonebook, lastname, phone ) VALUES(?,?,?) "; // Добавление новых обектов в базу данных.
    private Connection connection;

    public DataBaseHelper() throws SQLException {
        connection = ConnectorDB.getConnection();

    }

    public PreparedStatement getPreparedStatement() {

        PreparedStatement ps = null; //Используется для выполнения часто повторяющихся запросов SQL.Такой оператор предварительно готовится и хранится в объекте,
        // что ускоряет обмен информацией с базой данных при многократном выполнении однотипных запросов.

        try {
            ps = connection.prepareStatement(SQL_INSERT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }

    public boolean insertAbonent(PreparedStatement ps, Abonent abonent) {
        boolean flag = false;
        try {
            ps.setInt(1, abonent.getId()); // С помощью этих методов производитсья установка входных значений конкретных параметров.
            ps.setInt(3, abonent.getPhone());
            ps.setString(2, abonent.getLastName());
            ps.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public void closeStatement(PreparedStatement preparedStatement) {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
