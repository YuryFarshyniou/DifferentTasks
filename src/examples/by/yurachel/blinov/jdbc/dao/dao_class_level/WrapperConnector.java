package examples.by.yurachel.blinov.jdbc.dao.dao_class_level;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

public class WrapperConnector {
    private Connection connection;

    public WrapperConnector() {
        try {
            ResourceBundle resource = ResourceBundle.getBundle("resource.database"); // Класс ResourceBundle предназначен для чтения данных из текстовых файлов свойств (расширение - properties).
            String url = resource.getString("url");
            String user = resource.getString("user");
            String pass = resource.getString("password");
            Properties prop = new Properties();
            prop.put("user", user);
            prop.put("password", pass);
            connection = DriverManager.getConnection(url, prop);
        } catch (MissingResourceException | SQLException exception) {
            System.err.println("some exception");
        }
    }

    public Statement getStatement() throws SQLException {
        if (connection != null) {
            Statement statement = connection.createStatement();
            if (statement != null) {
                return statement;
            }
        }
        throw new SQLException("connection or statement is null");
    }

    public void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                System.err.println("statement is null " + e);
            }
        }
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("wrong connection " + e);
            }
        }
    }
    // другие необходимые делегированные методы.
}
