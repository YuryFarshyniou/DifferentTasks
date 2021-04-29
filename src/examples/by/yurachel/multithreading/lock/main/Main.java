package examples.by.yurachel.multithreading.lock.main;

import examples.by.yurachel.multithreading.lock.entity.DoubleResource;
import examples.by.yurachel.multithreading.lock.entity.ResThread;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            DoubleResource resource = new DoubleResource();
            new ResThread("a", resource).start();
            new ResThread("z", resource).start();
            new ResThread("#", resource).start();
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println(resource);
        }
    }
}
