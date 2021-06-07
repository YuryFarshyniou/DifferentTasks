package examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example_2;

public class FileLogger extends Logger {
    public FileLogger() {
    }

    public FileLogger(LoggerImplementor logger) {
        super(logger);
    }

    @Override
    public void log() {
        logger.logToFile();
    }
}
