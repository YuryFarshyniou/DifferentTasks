package examples.by.yurachel.blinov.patterns.behavioral_patterns.memento.basic;

/*Класс ,сохранением состояния которого занимается Memento*/
//Инициатор,создатель,автор.
public class Originator {
    private String state = "Initial state";

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void execute() {
        state = "New state";
    }

    @Override
    public String toString() {
        return state;
    }
}
