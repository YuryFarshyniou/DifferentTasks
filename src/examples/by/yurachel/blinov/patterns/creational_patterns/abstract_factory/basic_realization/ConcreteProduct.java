package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.basic_realization;

public class ConcreteProduct implements AbstractProduct {
    //Fields constructors methods.
    @Override
    public void info() {
        System.out.println("Concrete product");
    }
}
