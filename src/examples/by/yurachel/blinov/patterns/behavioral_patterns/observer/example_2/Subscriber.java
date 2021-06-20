package examples.by.yurachel.blinov.patterns.behavioral_patterns.observer.example_2;

import java.util.List;

public class Subscriber implements Observer {
private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\n We have some changes in vacancies." +
                vacancies + "\n=======================================\n");
    }
}
