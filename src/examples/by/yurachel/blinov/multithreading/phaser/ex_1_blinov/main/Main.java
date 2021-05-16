package examples.by.yurachel.blinov.multithreading.phaser.ex_1_blinov.main;

import examples.by.yurachel.blinov.multithreading.phaser.ex_1_blinov.entity.Item;
import examples.by.yurachel.blinov.multithreading.phaser.ex_1_blinov.entity.Storage;
import examples.by.yurachel.blinov.multithreading.phaser.ex_1_blinov.entity.Truck;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Phaser;

/* Основным назначением класса Phaser является синхронизация потоков,выполнение которых требуется разбить на отдельные этапы(фазы),а эти фазы
 * в свою очередь необходимо синхронизировать.
 * */
public class Main {
    public static void main(String[] args) {

        // Создание коллекции товаров.
        Item[] goods = new Item[20];
        for (int i = 0; i < goods.length; i++) {
            goods[i] = new Item(i + 1);
        }
        List<Item> listGood = Arrays.asList(goods);

        //Создание склада,из которго забирают товары.
        Storage storageA = Storage.createStorage(listGood.size(), listGood);

        //Создание склада,куда привозят товары.
        Storage storageB = Storage.createStorage(listGood.size());

        //Создание phaser, для синхронизации движения колонны грузовиков.
        Phaser phaser = new Phaser();
        phaser.register(); // регистрирует участников.
        int currentPhase;

        //Создание колонны грузовиков.
        Thread tr1 = new Thread(new Truck(phaser, "tr1", 5, storageA, storageB));
        Thread tr2 = new Thread(new Truck(phaser, "tr2", 6, storageA, storageB));
        Thread tr3 = new Thread(new Truck(phaser, "tr3", 7, storageA, storageB));

        printGoodsToConsole("Goods on storage A", storageA);
        printGoodsToConsole("Goods on storage B", storageB);

        //Запуск колонны грузовиков на загрузку на одном складе+поездку+разгрузку на другом складе.

        tr1.start();
        tr2.start();
        tr3.start();

        //Синхронизация загрузки.
        currentPhase = phaser.getPhase(); // Возвращает текущий номер фазы.
        phaser.arriveAndAwaitAdvance();  // Позволяет задерживать поток,пока другие потоки не достигнут конца текущей фазы.
        System.out.println("Load to column complited " + currentPhase + " ended.");

        //Синхронизация поездки.

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Roading column is ended " + currentPhase + " Phase ended.");

        //Синхронизация разгрузки.

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("uploading is finished.Phase " + currentPhase + " ended.");

        phaser.arriveAndDeregister(); //Выход из синхронизации Phaser-объектом производится этим методом.
        if (phaser.isTerminated()) {
            System.out.println("Phases are synchronized and ended.");
        }
        printGoodsToConsole("Goods on storageA", storageA);
        printGoodsToConsole("Goods on storageB", storageB);

    }

    public static void printGoodsToConsole(String title, Storage storage) {
        System.out.println(title);
        Iterator<Item> iterator = storage.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().getRegistrationNumber() + " ");
        }
        System.out.println();
    }
}
