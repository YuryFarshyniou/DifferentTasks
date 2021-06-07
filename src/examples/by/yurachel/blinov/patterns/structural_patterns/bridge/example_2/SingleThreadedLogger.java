package examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example_2;

public class SingleThreadedLogger implements LoggerImplementor {
    @Override
    public void logToConsole() {
        System.out.println("SingleThreaded console logger");
    }

    @Override
    public void logToFile() {
        System.out.println("SingleThreaded file logger");
    }

    @Override
    public void logToSocket() {
        System.out.println("SingleThreaded socket logger");
    }
}
