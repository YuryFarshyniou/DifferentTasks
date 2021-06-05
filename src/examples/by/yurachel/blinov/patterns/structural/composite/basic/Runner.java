package examples.by.yurachel.blinov.patterns.structural.composite.basic;

public class Runner {
    public static void main(String[] args) {
        Component composite = new Composite();
        Component leaf = new Leaf();
        leaf.add(composite); // nothing happens
        composite.add(leaf);
        Client client = new Client(composite);
        client.execute();
    }
}
