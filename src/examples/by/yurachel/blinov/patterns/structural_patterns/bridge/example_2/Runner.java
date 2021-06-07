package examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example_2;

public class Runner {
    public static void main(String[] args) {
        LoggerImplementor loggerImplementor = new SingleThreadedLogger();
        Logger logger = new ConsoleLogger(loggerImplementor);
        logger.log();
        loggerImplementor = new MultiThreadedLogger();
        logger.setLogger(loggerImplementor);
        logger.log();
        new FileLogger(loggerImplementor).log();
    }
}
