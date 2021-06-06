package by.yurachel.ioc_example.entity.impl;

import by.yurachel.ioc_example.entity.Animal;

public class Dog implements Animal {
    @Override
    public String eat() {
        return "Dog is eating";
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
