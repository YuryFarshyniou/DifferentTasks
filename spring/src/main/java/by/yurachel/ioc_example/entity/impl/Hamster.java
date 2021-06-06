package by.yurachel.ioc_example.entity.impl;

import by.yurachel.ioc_example.entity.Animal;

public class Hamster implements Animal {
    @Override
    public String eat() {
        return "Hamster is eating";
    }

    @Override
    public String toString() {
        return "Hamster{}";
    }
}
