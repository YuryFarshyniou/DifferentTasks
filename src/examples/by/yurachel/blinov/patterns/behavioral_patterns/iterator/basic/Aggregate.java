package examples.by.yurachel.blinov.patterns.behavioral_patterns.iterator.basic;

/*Интерфейс Aggregate определяет метод,создающий конкретный экземпляр Iterator*/
public interface Aggregate {
    Iterator createIterator();
}
