package by.yurachel.ioc_example.entity.impl;

import by.yurachel.ioc_example.entity.Animal;

public class Cat implements Animal {
    private Cat() {

    }

    public static Cat factoryCat() {
        return new Cat();
    }

    public void init() {
        System.out.println("Initialization");
    }

    public void destroy() {
        System.out.println("Destroying ");
    }

    @Override
    public String eat() {
        return "Cat is eating";
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
