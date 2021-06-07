package examples.by.yurachel.blinov.patterns.structural_patterns.adapter.example;

public class JsonParser implements Parser{
    @Override
    public Order parse(String jsonOrder) {
        Order order = new Order();
        System.out.println("Parse JSON");
        return order;
    }
}
