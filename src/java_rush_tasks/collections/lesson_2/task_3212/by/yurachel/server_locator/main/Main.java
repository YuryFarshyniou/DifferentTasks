package java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.main;

import java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.logic.ServiceLocator;
import java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("EJBService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("JMSService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("EJBService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("JMSService");
        service.execute();
    }
}
