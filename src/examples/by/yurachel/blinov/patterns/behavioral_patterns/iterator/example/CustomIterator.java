package examples.by.yurachel.blinov.patterns.behavioral_patterns.iterator.example;

public interface CustomIterator {
    void first();
    void next();
    boolean isDone();
    Object currentItem();
}
