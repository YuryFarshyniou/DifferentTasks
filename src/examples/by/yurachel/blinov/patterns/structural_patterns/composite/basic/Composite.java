package examples.by.yurachel.blinov.patterns.structural_patterns.composite.basic;

import java.util.ArrayList;
import java.util.List;

/*Тип Composite хранит составные и неделимые компоненты и определя-
ет их поведение. Способ организации и поведения Composite зависит от задач,
решаемых этим самым составным объектом.*/
public class Composite implements Component {
    private List<Component> components = new ArrayList<>();

    @Override
    public void operation() {
        System.out.println("Composite -> Call children operations.");
        int size = components.size();
        for (int i = 0; i < size; i++) {
            components.get(i).operation();
        }
    }

    @Override
    public void add(Component c) {
        System.out.println("Composite -> Adding component.");
        components.add(c);
    }

    @Override
    public void remove(Component c) {
        System.out.println("Composite -> Removing component.");
        components.remove(c);
    }

    @Override
    public Object getChild(int index) {
        System.out.println("Composite -> Getting component.");
        return components.get(index);
    }
}
