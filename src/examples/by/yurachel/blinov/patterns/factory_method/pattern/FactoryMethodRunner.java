package examples.by.yurachel.blinov.patterns.factory_method.pattern;

public class FactoryMethodRunner {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.check();
    }
}
