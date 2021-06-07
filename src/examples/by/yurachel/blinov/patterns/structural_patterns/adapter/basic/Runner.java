package examples.by.yurachel.blinov.patterns.structural_patterns.adapter.basic;

public class Runner {
    public static void main(String[] args) {
        Adapter target = new ConcreteAdapter(new Adaptee());
        Client client = new Client(target);
        client.execute();
    }
}
