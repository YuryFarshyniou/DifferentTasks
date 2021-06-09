package examples.by.yurachel.blinov.patterns.structural_patterns.proxy.example;

import java.util.concurrent.ArrayBlockingQueue;

/*Если пул соединений создается с параметром ProxyConnection:
ConnectionPool<ProxyConnection> pool = new ConnectionPool<>(20);
то соединение, извлеченное из пула, позволяет выполнять все необходимые
для объекта такого рода действия. При возвращении соединения в пул методом
closeConnection(T c) можно передать только прокси-объект. Попытка возвраще-
ния обычного экземпляра Connection приведет к ошибке компиляции. То есть
«дикие» соединения попасть в пул не могут, и безопасность пула обеспечена.*/

public class SafetyConnectionPool<T> {
    private ArrayBlockingQueue<T>connectionQueue;
    public SafetyConnectionPool(final int POOL_SIZE) throws InterruptedException {
        connectionQueue = new ArrayBlockingQueue<>(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            T connection = getConnection(); // create new connection
            connectionQueue.offer(connection);
        }
    }
    public T getConnection() throws InterruptedException {
        T connection;
        connection = connectionQueue.take();
        return connection;
    }
    public void closeConnection(T connection){
        connectionQueue.offer(connection); // Возможны утечки соединений.
    }

}
