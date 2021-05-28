package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.example;

public class TaskManager extends AbstractHandler {
    @Override
    public void handleRequest(Employee employee) {
        //more code.

    }

    public TaskManager() {
        assignTask();
    }

    public void assignTask() {
        System.out.println("assign Task.");

    }

}
