package examples.by.yurachel.blinov.patterns.abstract_factory.basic_realization;

public class ConcreteFactory implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        System.out.println("Creating concrete product");
        return new ConcreteProduct();
    }
}
