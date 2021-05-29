package examples.by.yurachel.blinov.patterns.behavioral_patterns.mediator.basic;

public class Runner {
    public static void main(String[] args) {
        ConcreteMediator cm = new ConcreteMediator();
        cm.setTrue();
        cm.setFalse();
        cm.setDifferent();
    }
}
