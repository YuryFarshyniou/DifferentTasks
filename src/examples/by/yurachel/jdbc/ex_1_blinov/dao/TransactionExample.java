package examples.by.yurachel.jdbc.ex_1_blinov.dao;


import java.sql.*;

/* Перечисление денег с одного счета на другой.Если сбой произошел в тот момент,когда операция снятия денег
с одного счета уже произведена,а операция зачисления на другой счет еще не произведена,то система,допускающая
такие ситуации,должна быть признана не отвечающей требованию заказчика.Или должны выполняться две операции,
либо не выполнятся вовсе.Такие две операции трактуют как одну и называют транзакцией.
* */

public class TransactionExample {
    private Connection connectionTo;
    private Connection connectionFrom;
    private static TransactionExample instance = null;


    // Реализуем паттер Singleton.
    public synchronized static TransactionExample getInstance() {
        if (instance == null) {
            instance = new TransactionExample();
            instance.getConnectionTo();
            instance.getConnectionFrom();
        }
        return instance;
    }

    /*  Для фиксации результатов  работы SQL-операторов,логически выполняемых в рамках некоторой транзакции,используется SQL-оператор COMMIT.
    В JDBC эта операция выполняется по умолчанию после каждого выхова метода executeQuery and executeUpdate.Если же необходимо сгрупировать запросы
    и только после этого выполнить операция COMMIT,начала вызывается метод setAutoCommit(boolean param) нтерфейса Connection с параметром false,в
    результате выполнение которого текущее состояние с БД переходит в режим неавтоматического выполнения операций.После этого выполнение любого запроса
    на изменение информации в таблицах базы данных не приведет к необратимым последствиям,пока операция COMMIT не будет выполнена непосредственно.
    Подтвержает выполнение SQL-запросов метод commit() интерфейса Connection,в результате действия которого все изменения таблицы производятся как одно
    логическое действие.Если же транзакция не выполнена,то методом rollback() отменяются действия всех запросов SQL,начиная от последнего вызова commit().

     * */

    private Connection getConnectionFrom() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Возвращает объект Class,связанный с классом или интерфейсом с заданной строкой.
            connectionFrom = DriverManager.getConnection("jdbc:mysql://localhost:3306/testFrom", "root", "pass");
            connectionFrom.setAutoCommit(false); // Текущее состояние с БД переходит в режим неавтоматического выполнения операций.
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage() +
                    " SQLState: " + e.getSQLState());
        } catch (ClassNotFoundException e) {
            System.err.println("Driver not found.");
        }
        return connectionFrom;
    }


    private Connection getConnectionTo() {
        final String connectionToAddress = "jdbc:mysql://10.162.4.151:3306/testTo";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connectionTo = DriverManager.getConnection(connectionToAddress, "root", "password");
            connectionTo.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage() +
                    " SQLState: " + e.getSQLState());
        } catch (ClassNotFoundException e) {
            System.err.println("Driver not found.");
        }
        return connectionTo;
    }

    public void Transfer(String summa) throws SQLException {
        Statement stFrom = null;
        Statement stTo = null;
        try (ResultSet rsFrom =
                     stFrom.executeQuery("SELECT balance from table_from");
             ResultSet rsTo =
                     stTo.executeQuery("SELECT balance from table_to")) {
            int sum = Integer.parseInt(summa);
            if (sum < 0) {
                throw new NumberFormatException("less or equals zero");

            }
            stFrom = connectionFrom.createStatement();
            stTo = connectionTo.createStatement();
            //Транзакция из 4х запросов.


            int accountFrom = 0;
            while (rsFrom.next()) {
                accountFrom = rsFrom.getInt(1);
            }
            int resultFrom = 0;
            if (accountFrom >= sum) {
                resultFrom = accountFrom - sum;
            } else {
                throw new SQLException("Invalid balance");
            }
            int accountTo = 0;
            while (rsTo.next()) {
                accountTo = rsTo.getInt(1);
            }
            int resultTo = accountTo + sum;
            stFrom.executeUpdate("UPDATE table_from SET balance=" + resultFrom);
            stTo.executeUpdate("UPDATE table_to SET balance=" + resultTo);
            //Завершение транзакции.
            connectionFrom.commit(); // Подтверждает выполнение SQL запроса.
            connectionTo.commit();
            System.out.println("remaining on:" + resultFrom + " rub");
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage() +
                    " SQLState: " + e.getSQLState());
            //Откат транзакции при ошибке.
            connectionFrom.rollback(); // Отменяте действие всех запросов SQL,с полденого commit.
            connectionTo.rollback();
        } catch (NumberFormatException e) {
            System.err.println("Invalid sum: " + summa);
        }
    }
}
