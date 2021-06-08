package by.yurachel.annotation_example.entity.impl;

import by.yurachel.annotation_example.entity.Animal;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
