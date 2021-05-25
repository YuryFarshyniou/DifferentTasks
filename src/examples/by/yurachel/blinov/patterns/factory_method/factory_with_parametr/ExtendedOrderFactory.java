package examples.by.yurachel.blinov.patterns.factory_method.factory_with_parametr;

import examples.by.yurachel.blinov.patterns.factory_method.simplest_example.ExtendedOrder;

public class ExtendedOrderFactory extends AbstractOrderFactory<ExtendedOrder> {
    @Override
    public ExtendedOrder getInstance() {
        return new ExtendedOrder();
    }
}
