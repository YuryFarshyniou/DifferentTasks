package examples.by.yurachel.blinov.jdbc.main;

import examples.by.yurachel.blinov.jdbc.dao.ConnectorDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableState {
    private static String SQL = "{call getlastname (?,?})"; // Вызывает хранимую процедуру.

    public static void main(String[] args) {
        try (Connection cn = ConnectorDB.getConnection();
             CallableStatement ct = cn.prepareCall(SQL)) { // Обеспечивает выполнение хранимых процедур.
            cn.commit();
            ct.setInt(2, 3198067);
            ct.registerOutParameter(1, Types.VARCHAR);
            ct.execute();
            String lastname = ct.getString(1);
            System.out.println(lastname);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
