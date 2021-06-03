package examples.by.yurachel.blinov.patterns.structural.bridge.basic;

/*Abstraction — собственно абстракция. Определяет базовый интерфейс аб-
стракции и агрегирует объект типа Implementor;*/
public interface Abstraction {
    static Implementor implementor = null;

     void operation();
}
