package examples.by.yurachel.blinov.multithreading.exchanger.ex_1_blinov.main;

import examples.by.yurachel.blinov.multithreading.exchanger.ex_1_blinov.entity.Consumer;
import examples.by.yurachel.blinov.multithreading.exchanger.ex_1_blinov.entity.Item;
import examples.by.yurachel.blinov.multithreading.exchanger.ex_1_blinov.entity.Producer;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item(32, 2200);
        Item i2 = new Item(32, 2100);
        new Thread(new Producer("HP", i1)).start();
        new Thread(new Consumer("Retail Trade", i2)).start();

    }
}
