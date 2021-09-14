package by.yurachel.config.impl;

import by.yurachel.config.Config;
import lombok.Getter;
import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;

public class JavaConfig implements Config {

    @Getter
    private final Reflections scanner;
    private Map<Class, Class> inter2ImplClass; //


    public JavaConfig(String packageToScan, Map<Class, Class> inter2ImplClass) {
        this.inter2ImplClass = inter2ImplClass;
        this.scanner = new Reflections(packageToScan);

    }

    @Override
    public <T> Class<? extends T> getImplClass(Class<T> inter) {
        return inter2ImplClass.computeIfAbsent(inter, aClass -> {  // Принимает ключ,и если ключ существует,то он возвращает значение ключа.Если не существует,запускает лчмбду,которая возвращает значение,засетает его в мапу и вернется к нам.

            Set<Class<? extends T>> subTypesOf = scanner.getSubTypesOf(inter);
            if (subTypesOf.size() != 1) {
                throw new RuntimeException(inter + " has 0 or more than one impl.Please update your config");
            }
            return subTypesOf.iterator().next();
        });
    }
}
