package examples.by.yurachel.blinov.patterns.factory_method.simplest_example;

public class ExtendedOrder extends AbstractOrder {
    // Fields and methods.
    @Override
    public void perform() {
        System.out.println("Extended order.");
    }
}
