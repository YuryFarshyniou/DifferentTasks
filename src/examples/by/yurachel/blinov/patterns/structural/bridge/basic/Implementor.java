package examples.by.yurachel.blinov.patterns.structural.bridge.basic;

/*Implementor — исполнитель. Определяет интерфейс для классов реализа-
ции. Обычно интерфейс Implementor содержит только элементарные опе-
рации, а тип Abstraction определяет операции более высокого уровня или
композиции элементарных операций;*/
public interface Implementor {
    void operationImp();
}
