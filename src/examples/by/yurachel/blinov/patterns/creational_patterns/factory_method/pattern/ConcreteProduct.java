package examples.by.yurachel.blinov.patterns.creational_patterns.factory_method.pattern;

public class ConcreteProduct implements Product {
    // Field,Constructors.
    @Override
    public void check() {
        System.out.println("Concrete product");
    }
}
