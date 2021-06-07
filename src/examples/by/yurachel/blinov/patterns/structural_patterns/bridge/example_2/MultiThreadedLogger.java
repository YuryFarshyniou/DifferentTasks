package examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example_2;

public class MultiThreadedLogger implements LoggerImplementor {
    @Override
    public void logToConsole() {
        System.out.println("Multithreaded console log");
    }

    @Override
    public void logToFile() {
        System.out.println("Multithreaded file log");
    }

    @Override
    public void logToSocket() {
        System.out.println("Multithreaded socket log");
    }
}
