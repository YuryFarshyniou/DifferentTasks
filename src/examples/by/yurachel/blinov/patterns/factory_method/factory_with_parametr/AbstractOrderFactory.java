package examples.by.yurachel.blinov.patterns.factory_method.factory_with_parametr;

import examples.by.yurachel.blinov.patterns.factory_method.simplest_example.AbstractOrder;

public abstract class AbstractOrderFactory<T extends AbstractOrder> {
    public abstract T getInstance();

    public void anOperation() {
        System.out.println("Operation");
    }
}
