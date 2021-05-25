package examples.by.yurachel.blinov.patterns.factory_method.simplest_example;

import java.util.Locale;

public class OrderFactory {
    // Simplest pattern realization
    public static AbstractOrder getOrderFromFactory(String type) {
        TypeOrder sign = TypeOrder.valueOf(type.toUpperCase(Locale.ROOT));
        switch (sign) {
            case SIMPLE:
                return new SimpleOrder();
            case EXTENDED:
                return new ExtendedOrder();
            default:
                throw new EnumConstantNotPresentException(
                        TypeOrder.class, sign.name());
        }
    }

    public void anOperation() {
        System.out.println("Operation.");
    }
}
