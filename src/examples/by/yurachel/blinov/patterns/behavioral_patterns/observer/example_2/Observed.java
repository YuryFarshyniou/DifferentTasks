package examples.by.yurachel.blinov.patterns.behavioral_patterns.observer.example_2;

public interface Observed {
    void addObserver(Observer observer );
    void removeObserver(Observer observer);
    void notifyObservers();
}
