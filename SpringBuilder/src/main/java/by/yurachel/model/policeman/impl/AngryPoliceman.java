package by.yurachel.model.policeman.impl;

import by.yurachel.model.policeman.Policeman;

public class AngryPoliceman implements Policeman {
    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Kill you all!!Go out!");
    }
}
