package examples.by.yurachel.multithreading.exchanger.main;

import examples.by.yurachel.multithreading.exchanger.entity.Consumer;
import examples.by.yurachel.multithreading.exchanger.entity.Item;
import examples.by.yurachel.multithreading.exchanger.entity.Producer;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item(32, 2200);
        Item i2 = new Item(32, 2100);
        new Thread(new Producer("HP", i1)).start();
        new Thread(new Consumer("Retail Trade", i2)).start();

    }
}
