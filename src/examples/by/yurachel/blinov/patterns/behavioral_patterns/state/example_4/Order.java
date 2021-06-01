package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_4;

public class Order {
    private IPayState currentOrderState;
    private int days;
    private double cost;
    public final double PERCENT = 0.01;
    public Order(double cost, int days){
        currentOrderState = new UnPurchasedState() ;
        this.days = days;//В течении срока заказ должен быть оплачен.
        this.cost = cost;//Стоимость заказа.

    }
    public void purchased(){
        currentOrderState.purchase(this);
    }

    public void setCurrentOrderState(IPayState currentOrderState) {
        this.currentOrderState = currentOrderState;
    }
    public void checked(){
        currentOrderState.check(this);
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
