package examples.by.yurachel.blinov.patterns.creational_patterns.factory_method.ex_with_abstract_fact;

import examples.by.yurachel.blinov.patterns.creational_patterns.factory_method.simplest_example.AbstractOrder;
import examples.by.yurachel.blinov.patterns.creational_patterns.factory_method.simplest_example.ExtendedOrder;

public class ExtendedOrderFactory extends AbstractOrderFactory {
    @Override
    public AbstractOrder getOrder() {
        return new ExtendedOrder();
    }
}
