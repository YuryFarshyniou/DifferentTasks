package java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.logic;

import java_rush_tasks.collections.lesson_2.task_3212.by.yurachel.server_locator.service.Service;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private final List<Service> services;

    public Cache() {
        services = new ArrayList<>();
    }

    public Service getService(String serviceName) {
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Return cached  " + serviceName + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService) {
        boolean exists = false;
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName())) {
                exists = true;
            }
        }
        if (!exists) {
            services.add(newService);
        }
    }
}
