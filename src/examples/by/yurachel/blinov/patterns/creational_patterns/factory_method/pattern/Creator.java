package examples.by.yurachel.blinov.patterns.creational_patterns.factory_method.pattern;

public abstract class Creator {
    public abstract Product factoryMethod();

    public void anOperation() {
        System.out.println("operation");
    }
}
