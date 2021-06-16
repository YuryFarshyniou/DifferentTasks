package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.example_2;

public class EmailNotifier extends Notifier{
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email " + message);
    }
}
