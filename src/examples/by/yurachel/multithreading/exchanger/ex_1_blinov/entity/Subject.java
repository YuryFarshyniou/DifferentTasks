package examples.by.yurachel.multithreading.exchanger.ex_1_blinov.entity;

import java.util.concurrent.Exchanger;

public class Subject {
    protected static Exchanger<Item> exchanger = new Exchanger<>(); //Осуществляет возможность обмена объектов,в том числе и иснхронизированными.
    private String name;
    protected Item item;

    public Subject(String name, Item item) {
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
