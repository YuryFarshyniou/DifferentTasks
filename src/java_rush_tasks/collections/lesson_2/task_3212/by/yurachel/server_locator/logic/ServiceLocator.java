package java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.logic;

import java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.context.InitialContext;
import java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.service.Service;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    /**
     * First, check for a service object in the cache
     * If a service object is not in the cache, perform a lookup using
     * the JNDI initial context and get the service object. Add it to
     * the cache for future use.
     *
     * @param jndiName The name of the service object in the context
     * @return Object mapped to the name in context
     */
    public static Service getService(String jndiName) {
        Service service = cache.getService(jndiName);
        if (service != null) {
            return service;
        }
        InitialContext ic = new InitialContext();
        Service newService = (Service) ic.lookup(jndiName);
        cache.addService(newService);

        return newService;
    }
}
