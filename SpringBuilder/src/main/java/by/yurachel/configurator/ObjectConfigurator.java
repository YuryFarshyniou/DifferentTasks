package by.yurachel.configurator;

import by.yurachel.context.ApplicationContext;

/*BeanPostProcessor*/
public interface ObjectConfigurator {
    void configure(Object t, ApplicationContext context);
}
