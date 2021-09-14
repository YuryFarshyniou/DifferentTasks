package by.yurachel.announcer.impl;

import by.yurachel.annotation.InjectByType;
import by.yurachel.announcer.Announcer;
import by.yurachel.recommendator.Recommendator;

public class ConsoleAnnouncer implements Announcer {
    @InjectByType
    private Recommendator recommendator;

    @Override
    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
