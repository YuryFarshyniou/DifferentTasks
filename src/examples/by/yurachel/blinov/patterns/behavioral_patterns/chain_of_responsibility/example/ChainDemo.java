package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.example;

public class ChainDemo {
    public static void main(String[] args) {
        Employee user = new Employee(30, "user", "passwordUser");
        // chain configuration
        RoleManager rm = new RoleManager();
        Authentification auth = new Authentification();
        TaskManager tm = new TaskManager();
        auth.setSuccessor(rm);
        rm.setSuccessor(tm);
        System.out.println("-----chain-starts----");
        auth.chain(user);
    }
}
