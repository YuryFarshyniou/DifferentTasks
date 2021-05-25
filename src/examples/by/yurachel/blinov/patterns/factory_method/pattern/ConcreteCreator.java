package examples.by.yurachel.blinov.patterns.factory_method.pattern;

public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod() {
        // preparatory actions.
        this.anOperation();
        return new ConcreteProduct();
    }
}
