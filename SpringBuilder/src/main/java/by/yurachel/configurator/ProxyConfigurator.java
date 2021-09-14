package by.yurachel.configurator;

public interface ProxyConfigurator {
    Object replaceWithProxyIfNeeded(Object t, Class implClass);
}
