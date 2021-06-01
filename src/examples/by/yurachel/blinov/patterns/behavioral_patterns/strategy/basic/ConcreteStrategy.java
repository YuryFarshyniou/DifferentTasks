package examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.basic;

public class ConcreteStrategy implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("Using concrete algorithm");
    }
}
