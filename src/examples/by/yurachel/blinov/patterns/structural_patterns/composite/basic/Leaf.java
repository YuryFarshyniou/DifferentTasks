package examples.by.yurachel.blinov.patterns.structural_patterns.composite.basic;

/*У интерфейса Component обычно существует одна или несколько реализаций
типа Leaf, не имеющие потомков и описывающие неделимые элементы струк-
туры.*/
public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf -> Performing operation.");
    }

    @Override
    public void add(Component c) {
        System.out.println("Leaf -> add. Doing nothing.");
        //Генерация исключение и return false(если метод не void).
    }

    @Override
    public void remove(Component c) {
        System.out.println("Leaf -> remove. Doing nothing.");
        //генерация исключения и return false(если метод не void).
    }

    @Override
    public Object getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
