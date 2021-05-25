package examples.by.yurachel.blinov.patterns.factory_method.simplest_example;

public class RunFactoryMethodSimplest {
    public static void main(String[] args) {
        AbstractOrder ob1= OrderFactory.getOrderFromFactory("simple");
        AbstractOrder ob2 = OrderFactory.getOrderFromFactory("extended");
        ob1.perform();
        ob2.perform();
    }
}
