package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.basic;

public class MainChain {
    public static void main(String[] args) {
        // Configuration chain.

        Task root = new Task("get offset");
        SubTask subTask = new SubTask("write a test", root);
        Question question = new Question("Make a lab", subTask);
        //Start
        System.out.println("Message form Question < " + question.handleRequest() + " >");
    }
}
