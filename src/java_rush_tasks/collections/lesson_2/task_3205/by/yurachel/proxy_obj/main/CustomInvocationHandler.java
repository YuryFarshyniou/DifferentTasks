package java_rush_tasks.collections.lesson_2.task_3205.by.yurachel.proxy_obj.main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {

    private SomeInterfaceWithMethods si;

    public CustomInvocationHandler(SomeInterfaceWithMethods si) {
        this.si = si;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            System.out.println(method.getName() + " in");
            return method.invoke(si, args);
        } finally {
            System.out.println(method.getName() + " out");
        }
    }
}
