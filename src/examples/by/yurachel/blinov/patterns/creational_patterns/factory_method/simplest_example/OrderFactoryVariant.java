package examples.by.yurachel.blinov.patterns.creational_patterns.factory_method.simplest_example;

public class OrderFactoryVariant {
    // Standard pattern realization
    //Fields and methods.

    public SimpleOrder getSimpleOrder() {
        return new SimpleOrder();
    }

    public ExtendedOrder getExtendOrder() {
        return new ExtendedOrder();
    }

    public void anOperation() {
        System.out.println("operation");
    }
}
