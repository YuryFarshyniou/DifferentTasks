package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_4;

public class PurchasedState implements IPayState{
    @Override
    public void check(Order order) {
        //Check
        System.out.println("Оплаченный заказ проверен.");
    }

    @Override
    public void purchase(Order order) {
//Оплата
        System.out.println("Заказ оплачен.");
    }
}
