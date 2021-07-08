package examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.example_3;

public class Runner {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Sleeping());
        developer.executeActivity();
        developer.setActivity(new Training());
        developer.executeActivity();
        developer.setActivity(new Coding());
        developer.executeActivity();
        developer.setActivity(new Reading());
        developer.executeActivity();
    }
}
