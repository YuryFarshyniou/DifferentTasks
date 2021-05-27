package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.basic_realization;

public class Runner {
    public static void main(String[] args) {
        Client client = new Client();
        client.setAbstractFactory(new ConcreteFactory());
        client.action();
    }
}
