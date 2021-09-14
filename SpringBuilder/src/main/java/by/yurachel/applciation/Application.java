package by.yurachel.applciation;

import by.yurachel.config.impl.JavaConfig;
import by.yurachel.context.ApplicationContext;
import by.yurachel.object_factory.ObjectFactory;

import java.util.Map;

public class Application {
    public static ApplicationContext run(String packagesToScan, Map<Class, Class> ifc2ImplClass) {
        JavaConfig javaConfig = new JavaConfig(packagesToScan, ifc2ImplClass);
        ApplicationContext applicationContext = new ApplicationContext(javaConfig);
        ObjectFactory objectFactory = new ObjectFactory(applicationContext);
        applicationContext.setFactory(objectFactory);
        return applicationContext;
    }
}
