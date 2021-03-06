package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.basic;

public class Question implements BaseInterface {
    private String message = "";
    private SubTask parent = null;

    public Question(String message, SubTask parent) {
        this.message = message;
        this.parent = parent;
    }


    @Override
    public String handleRequest() {
        System.out.println("Message in question: " + message);
        if (parent == null) {
            return message;
        } else {
            return parent.handleRequest();
        }
    }
}
