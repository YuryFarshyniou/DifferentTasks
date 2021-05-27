package examples.by.yurachel.blinov.patterns.creational_patterns.singleton;

import java.util.concurrent.locks.ReentrantLock;

/*Для обеспечения синхронизации без инициализации экземпляра в статиче-
ском поле можно использовать класс ReentrantLock:
* */
public class LockImpl {
    private static LockImpl instance = null;
    private static ReentrantLock lock = new ReentrantLock();

    private LockImpl() {
    }

    public static LockImpl getInstance() {
        lock.lock();  // Blocking
        try {
            if (instance == null) {
                instance = new LockImpl();
            }
        } finally {
            lock.unlock(); // unblocking
        }
        return instance;
    }
}
