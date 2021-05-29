package examples.by.yurachel.blinov.patterns.behavioral_patterns.iterator.basic;

/*Реализация шаблона должна представить выполнение операций:
        ——доступе к стартовому объекту извлечения, метод first();
        ——перемещение к следующему элементу, next();
        ——извлечение текущего элемента, currentItem();
        ——проверка наличия следующего элемента, isDone().
        Интерфейс Iterator объединяет перечисленные выше методы.*/

public interface Iterator {
    void first(); // Устанавливает итератор в начальную позицию.
    boolean isDone(); // аналогично hasNext().
    void next();//Изменяет позицию итератора,аналогично next().
    Object currentItem();// Извлекает объект в текущей позиции,аналогично next().
}
