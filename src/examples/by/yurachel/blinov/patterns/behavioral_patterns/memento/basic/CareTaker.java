package examples.by.yurachel.blinov.patterns.behavioral_patterns.memento.basic;

/*Восстанавливает сохраненное состояние.*/
//Смотритель
public class CareTaker {
    private Memento memento;

    public CareTaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
