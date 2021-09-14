package by.yurachel.config;

import org.reflections.Reflections;

public interface Config {

    <T> Class<? extends T> getImplClass(Class<T> inter);

    Reflections getScanner();
}
