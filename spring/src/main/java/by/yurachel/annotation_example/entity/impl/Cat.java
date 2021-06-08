package by.yurachel.annotation_example.entity.impl;

import by.yurachel.annotation_example.entity.Animal;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Cat implements Animal {
    @PostConstruct
    public void init() {
        System.out.println("Init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy");
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
