package examples.by.yurachel.blinov.patterns.structural_patterns.flyweight.basic;

public class FlyweightFactory {
    private Flyweight flyweight;

    public Flyweight getFlyweight() {
        return new ConcreteFlyweight();
    }
}
