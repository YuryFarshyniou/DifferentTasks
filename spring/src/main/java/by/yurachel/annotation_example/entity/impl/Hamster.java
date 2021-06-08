package by.yurachel.annotation_example.entity.impl;

import by.yurachel.annotation_example.entity.Animal;
import org.springframework.stereotype.Component;


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
