package examples.by.yurachel.blinov.patterns.structural_patterns.composite.basic;

/*Интерфейс Component задает интерфейс для всех составных объектов.*/

public interface Component {
    void operation();

    void add(Component c);

    void remove(Component c);

    Object getChild(int index);
}
