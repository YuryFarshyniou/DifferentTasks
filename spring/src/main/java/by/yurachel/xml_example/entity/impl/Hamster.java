package by.yurachel.xml_example.entity.impl;

import by.yurachel.xml_example.entity.Animal;

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
