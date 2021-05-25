package examples.by.yurachel.blinov.patterns.factory_method.ex_with_abstract_fact;

import examples.by.yurachel.blinov.patterns.factory_method.simplest_example.AbstractOrder;

public abstract class AbstractOrderFactory {
    public abstract AbstractOrder getOrder();
    public void anOperation(){
        System.out.println("Operation");
    }
}
