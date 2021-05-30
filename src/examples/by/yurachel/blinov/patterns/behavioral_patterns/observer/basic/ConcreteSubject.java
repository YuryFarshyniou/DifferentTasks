package examples.by.yurachel.blinov.patterns.behavioral_patterns.observer.basic;

import java.util.List;

public class ConcreteSubject implements Subject {
    public List<Observer> observer; // может быть единичным объектом.
    private Object state;

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }


    @Override
    public void attach(Observer observer) {
        //realization
    }

    @Override
    public void detach(Observer ob) {
        //realization

    }

    @Override
    public void notifyObservers() {
//Запуск метода(ов) Observer.
    }
}
