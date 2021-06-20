package examples.by.yurachel.blinov.patterns.behavioral_patterns.observer.example_2;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
