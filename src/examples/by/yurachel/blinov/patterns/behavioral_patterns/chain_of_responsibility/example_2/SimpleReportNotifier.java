package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.example_2;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using single report " + message);
    }
}
