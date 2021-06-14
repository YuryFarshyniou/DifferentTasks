package examples.by.yurachel.blinov.patterns.creational_patterns.singleton.example;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file";

    public static ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return new ProgramLogger();
    }

    public ProgramLogger() {
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogger() {
        System.out.println(logFile);
    }
}
