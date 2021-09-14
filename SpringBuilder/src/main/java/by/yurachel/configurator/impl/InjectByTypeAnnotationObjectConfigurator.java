package by.yurachel.configurator.impl;

import by.yurachel.annotation.InjectByType;
import by.yurachel.configurator.ObjectConfigurator;
import by.yurachel.context.ApplicationContext;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class  InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t, ApplicationContext context) {
        for (Field declaredField : t.getClass().getDeclaredFields()) {
            if (declaredField.isAnnotationPresent(InjectByType.class)) {
                declaredField.setAccessible(true);
                Object object = context.getObject(declaredField.getType());
                declaredField.set(t, object);
            }
        }
    }
}
