package examples.by.yurachel.blinov.patterns.creational_patterns.singleton.example;

public class Runner {
    public static void main(String[] args) {
        ProgramLogger logger = ProgramLogger.getProgramLogger();
        System.out.println(logger);
    }
}
