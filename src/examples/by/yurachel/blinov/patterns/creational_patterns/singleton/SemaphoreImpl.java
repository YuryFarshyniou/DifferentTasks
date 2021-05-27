package examples.by.yurachel.blinov.patterns.creational_patterns.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/* В случае, если шаблон Singleton подразумевает ограничение на количество
ссылок больше одной, то удобно использовать инициализацию через Semaphore.
* */
public class SemaphoreImpl {
    private static final int MAX_AVAILABLE = 10; // Лимит экземпляров списка.
    private static Semaphore semaphore = new Semaphore(MAX_AVAILABLE, true);
    private static List<SemaphoreImpl> instances =
            new ArrayList<>(MAX_AVAILABLE);

    private SemaphoreImpl() {
    }

    public static SemaphoreImpl getInstance(int index) {
        if (index >= 0 && index < instances.size()) { // List item access
            return instances.get(index);
        }
        if (semaphore.tryAcquire()) { //Reducing semaphore value on 1
            SemaphoreImpl tmp = new SemaphoreImpl();
            instances.add(tmp);
            return tmp;
        }
        throw new IllegalArgumentException();
    }

}
