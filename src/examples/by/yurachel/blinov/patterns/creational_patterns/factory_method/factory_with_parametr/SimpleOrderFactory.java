package examples.by.yurachel.blinov.patterns.creational_patterns.factory_method.factory_with_parametr;

import examples.by.yurachel.blinov.patterns.creational_patterns.factory_method.simplest_example.SimpleOrder;

public class SimpleOrderFactory extends AbstractOrderFactory<SimpleOrder> {
    @Override
    public SimpleOrder getInstance() {
        return new SimpleOrder();
    }
}
