package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_4;

public class UnPurchasedState implements IPayState {
    @Override
    public void check(Order order) {
        double percent = 0;
        if (order.getDays() <= 0) {
            percent = order.getCost() + order.PERCENT;
            order.setCost(order.getCost() + percent);
            //Не оплачен вовремя - начислены проценты.
        }
        System.out.println("Заказ не оплачен: штраф ->" + percent);
    }

    @Override
    public void purchase(Order order) {
        order.setCurrentOrderState(new PurchasedState());
    }
}
