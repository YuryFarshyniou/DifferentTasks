package examples.by.yurachel.blinov.patterns.factory_method.ex_with_abstract_fact;

import examples.by.yurachel.blinov.patterns.factory_method.simplest_example.AbstractOrder;

public class Client {
    // Fields and methods.

    public void someOperation(AbstractOrderFactory factory) {
        AbstractOrder order = factory.getOrder();
        order.perform();
    }
}
