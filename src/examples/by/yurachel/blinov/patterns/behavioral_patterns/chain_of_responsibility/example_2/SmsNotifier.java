package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.example_2;

public class SmsNotifier extends Notifier{
    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending sms to manager " + message);
    }
}
