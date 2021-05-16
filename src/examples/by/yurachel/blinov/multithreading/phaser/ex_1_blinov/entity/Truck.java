package examples.by.yurachel.blinov.multithreading.phaser.ex_1_blinov.entity;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Phaser;

public class Truck implements Runnable {
    private Phaser phaser;
    private String name;
    private int capacity;
    private Storage storageFrom;
    private Storage storageTo;
    private Queue<Item> bodyStorage;

    public Truck(Phaser phaser, String name, int capacity, Storage storageFrom, Storage storageTo) {
        this.phaser = phaser;
        this.name = name;
        this.capacity = capacity;
        this.storageFrom = storageFrom;
        this.storageTo = storageTo;
        this.bodyStorage = new ArrayDeque<>(capacity);
        this.phaser.register(); // регистрирует участников.
    }


    @Override
    public void run() {

        loadTruck();
        phaser.arriveAndAwaitAdvance(); // Позволяет задерживать поток,пока другие потоки не достигнут конца текущей фазы.

        goTruck();
        phaser.arriveAndAwaitAdvance(); // Позволяет задерживать поток,пока другие потоки не достигнут конца текущей фазы.

        unloadTruck();
        phaser.arriveAndAwaitAdvance(); // Позволяет задерживать поток,пока другие потоки не достигнут конца текущей фазы.
    }

    private void loadTruck() {
        for (int i = 0; i < capacity; i++) {
            Item g = storageFrom.getGood();
            if (g == null) {
                return;
            }
            bodyStorage.add(g);
            System.out.println("Truck " + name + " load product N " + g.getRegistrationNumber());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void unloadTruck() {
        int size = bodyStorage.size();
        for (int i = 0; i < size; i++) {
            Item g = bodyStorage.poll();
            storageTo.setGoods(g);
            System.out.println("Truck " + name + " upload product N " + g.getRegistrationNumber());
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void goTruck() {
        try {
            Thread.sleep(new Random(100).nextInt(500));
            System.out.println("Truck " + name + " going");
            Thread.sleep(new Random(100).nextInt(1000));
            System.out.println("Truck " + name + " arrived");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
