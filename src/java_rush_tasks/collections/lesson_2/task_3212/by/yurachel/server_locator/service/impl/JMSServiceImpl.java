package java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.service.impl;

import java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.service.Service;

public class JMSServiceImpl implements Service {
    @Override
    public void execute() {
        System.out.println("Executing the JMSService");
    }

    @Override
    public String getName() {
        return "JMSService";
    }
}
