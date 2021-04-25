package java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.context;

import java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.service.impl.EJBServiceImpl;
import java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.service.impl.JMSServiceImpl;

public class InitialContext {
    public Object lookup(String jndiName) {

        if (jndiName.equalsIgnoreCase("EJBService")) {
            System.out.println("Looking up and creating a new EJBService object");
            return new EJBServiceImpl();
        } else if (jndiName.equalsIgnoreCase("JMSService")) {
            System.out.println("Looking up and creating a new JMSService object");
            return new JMSServiceImpl();
        }
        return null;
    }
}
