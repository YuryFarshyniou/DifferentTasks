package examples.by.yurachel.blinov.patterns.structural_patterns.proxy.example;

/*Существует некоторый пул соединений с БД. Соединения по мере необхо-
димости извлекаются из пула и после использования возвращаются. При такой
реализации пул оказывается незащищенным от попадания в него «диких» сое-
динений, созданных вне пула, в то время как соединение, взятое из пула,
не сможет возвратиться в него, так как пул может оказаться заполнен «дикими»
соединениями. В итоге приложения из-за создания несанкционированных сое-
динений и нарушений работы пула будет работать медленнее и с ошибками,
возможно, критическими.*/

import java.sql.Connection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPool {
    private BlockingQueue<Connection> connectionQueue;

    public ConnectionPool(final int POOL_SIZE) throws InterruptedException {
        connectionQueue = new ArrayBlockingQueue<>(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            Connection connection = getConnection();//create connection

            connectionQueue.offer(connection);
        }
    }

    public Connection getConnection() throws InterruptedException {
        Connection connection;
        connection = connectionQueue.take();
        return connection;
    }

    public void closeConnection(Connection connection) {
        connectionQueue.offer(connection);
    }
}
