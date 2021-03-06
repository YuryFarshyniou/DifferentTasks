package examples.by.yurachel.blinov.multithreading.phaser.ex_1_blinov.entity;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Storage implements Iterable<Item> {
    public static final int DEFAULT_STORAGE_CAPACITY = 20;
    private final Queue<Item> goods;

    private Storage() {
        goods = new LinkedBlockingDeque<>(DEFAULT_STORAGE_CAPACITY);
    }

    private Storage(int capacity) {
        goods = new LinkedBlockingDeque<>(capacity);
    }

    public static Storage createStorage(int capacity) {
        return new Storage(capacity);
    }

    public static Storage createStorage(int capacity, List<Item> goods) {
        Storage storage = new Storage(capacity);
        storage.goods.addAll(goods);
        return storage;
    }

    public Item getGood() {
        return goods.poll();
    }

    public boolean setGoods(Item good) {
        return goods.add(good);
    }

    public Iterator<Item> iterator() {
        return goods.iterator();
    }


}
