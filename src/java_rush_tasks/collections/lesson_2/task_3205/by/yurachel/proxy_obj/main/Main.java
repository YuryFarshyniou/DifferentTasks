package java_rush_tasks.collections.lesson_2.task_3205.by.yurachel.proxy_obj.main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        SomeInterfaceWithMethods obj = getProxy();
        obj.stringMethodWithoutArgs();
        obj.voidMethodWithIntArg(1);

        /* expected output
        stringMethodWithoutArgs in
        inside stringMethodWithoutArgs
        stringMethodWithoutArgs out
        voidMethodWithIntArg in
        inside voidMethodWithIntArg
        inside voidMethodWithoutArgs
        voidMethodWithIntArg out
        */
    }

    public static SomeInterfaceWithMethods getProxy() {
        SomeInterfaceWithMethods si = new SomeInterfaceWithMethodsImpl();
        ClassLoader cl = si.getClass().getClassLoader();
        Class[] interfaces = si.getClass().getInterfaces();
        InvocationHandler ih = new CustomInvocationHandler(si);

        return (SomeInterfaceWithMethods) Proxy.newProxyInstance(cl,
                interfaces, ih);
    }
}
