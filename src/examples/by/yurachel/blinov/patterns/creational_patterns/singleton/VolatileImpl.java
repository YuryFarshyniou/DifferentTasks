package examples.by.yurachel.blinov.patterns.creational_patterns.singleton;

/* При создании единственного экземпляра в режиме многопоточности следу-
ет гарантировать невозможность получить не до конца сконструированный объ-
ект и при этом не потерять в производительности из-за постоянного контроля
ссылки логов синхронизации. В одном из допустимых решений этой проблемы
прибегают к volatile переменной.
* */
public class VolatileImpl {
    private static VolatileImpl instance = null;
    private volatile static boolean instanceCreated = false;

    private VolatileImpl() {
    }

    public static VolatileImpl getInstance() {
        if (!instanceCreated) {
            synchronized (VolatileImpl.class) {
                // or any other block type like Lock or Semaphore
                try {
                    if (!instanceCreated) {
                        instance = new VolatileImpl();
                        instanceCreated = true;
                    }
                } catch (Exception e) {
                    // Exception
                }
            }
        }
        return instance;
    }
}
