package by.yurachel.model.policeman.impl;

import by.yurachel.annotation.InjectByType;
import by.yurachel.model.policeman.Policeman;
import by.yurachel.recommendator.Recommendator;

import javax.annotation.PostConstruct;

public class PolicemanImpl implements Policeman {

    @InjectByType
    private Recommendator recommendator;

    @PostConstruct
    public void init() {
        System.out.println(recommendator.getClass());
    }

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Policemen: Everybody out!!!");
    }
}
