package examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.basic;

public class Runner {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy();
        Context context = new Context(strategy);
        context.contextInterface();
    }
}
