package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_5;

public class Runner {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();
        developer.setActivity(activity);
        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
