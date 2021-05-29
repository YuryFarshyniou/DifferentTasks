package examples.by.yurachel.blinov.patterns.behavioral_patterns.iterator.basic;

public class Runner {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.createIterator();
        iterator.first();
        while (!iterator.isDone()) {
            Object data = iterator.currentItem();
            iterator.next();
        }
    }
}
