package examples.by.yurachel.blinov.patterns.behavioral_patterns.iterator.basic;


/*Класс ConcreteAggregate предоставляет реализацию метод,объявленных в интерфейсе Iterator.*/
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate concreteAggregate;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
    }

    @Override
    public void first() {
        // First element in concreteAggregate.
    }

    @Override
    public boolean isDone() {
        //Check whether in concreteAggregate.
        return false;
    }

    @Override
    public void next() {
        // Next element in concreteAggregate.

    }

    @Override
    public Object currentItem() {
        //return current item in concreteAggregate.
        return null;
    }
}
