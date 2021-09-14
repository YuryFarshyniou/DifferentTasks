package by.yurachel.configurator.impl;

import by.yurachel.configurator.ProxyConfigurator;

import java.lang.reflect.Proxy;

public class DeprecatedHandlerProxyConfiguratorImpl implements ProxyConfigurator {
    @Override
    public Object replaceWithProxyIfNeeded(Object t, Class implClass) {
        if (implClass.isAnnotationPresent(Deprecated.class)) {
            return  Proxy.newProxyInstance(implClass.getClassLoader(), implClass.getInterfaces(), (proxy, method, args) -> {
                System.out.println("What are you doing??!");
                return method.invoke(t);
            });
        }else{
            return t;
        }
    }
}
