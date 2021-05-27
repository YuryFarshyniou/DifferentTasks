package examples.by.yurachel.blinov.patterns.creational_patterns.factory_method.simplest_example;

public class SimpleOrder extends AbstractOrder {
    // Fields and methods.
    @Override
    public void perform() {
        System.out.println("Simple order.");
    }
}
