package examples.by.yurachel.blinov.patterns.structural.bridge.example_2;

public class ConsoleLogger extends Logger {
    public ConsoleLogger() {
    }

    public ConsoleLogger(LoggerImplementor logger) {
        super(logger);
    }

    @Override
    public void log() {
        logger.logToConsole();
    }
}
