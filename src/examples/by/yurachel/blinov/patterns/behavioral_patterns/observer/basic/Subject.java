package examples.by.yurachel.blinov.patterns.behavioral_patterns.observer.basic;

public interface Subject {

    public void attach(Observer observer); // Прикреплять.
    public void detach(Observer ob);
    public void notifyObservers();// Поставить в известность.
}
