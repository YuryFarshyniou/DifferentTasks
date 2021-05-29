package examples.by.yurachel.blinov.patterns.behavioral_patterns.iterator.basic;

/*Класс ConcreteAggregate реализует метод извлечения итератора и как правило содержит итерируемую коллекцию
 * или другой объект,нуждающийся в переборе.*/
public class ConcreteAggregate implements Aggregate {
    @Override
    public Iterator createIterator() {
        System.out.println("Creating concrete iterator for concrete aggregate.");
        return new ConcreteIterator(this);
    }
}
