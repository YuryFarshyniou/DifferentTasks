package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_4;

public class Runner {
    public static void main(String[] args) {
        Order order = new Order(1000, 14);
        order.checked();
        order.setDays(-1);
        order.checked();
        order.purchased();
        order.checked();
    }
}
