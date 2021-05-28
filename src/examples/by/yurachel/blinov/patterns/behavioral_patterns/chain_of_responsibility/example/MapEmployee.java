package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.example;

import java.util.HashMap;
import java.util.Map;

public class MapEmployee {
    private Map<Integer, Employee> users = new HashMap<>();

    public MapEmployee() {
        users.put(1, new Employee(10, "admin", "passwordAdmin"));
        users.put(2, new Employee(20, "employee", "passwordEmployee"));
        users.put(3, new Employee(30, "user", "passwordUser"));

    }

    public Map<Integer, Employee> getUsers() {
        return users;
    }

    public boolean containsUser(Employee emp) {
        return users.containsValue(emp);
    }
}
