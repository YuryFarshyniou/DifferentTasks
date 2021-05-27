package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.basic;

public class Task implements BaseInterface {
    private String message = "";

    public Task(String message) {
        this.message = message;
    }

    @Override
    public String handleRequest() {
        System.out.println("message in Task: " + message);
        return message;
    }

}
