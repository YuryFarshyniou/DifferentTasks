package examples.by.yurachel.multithreading.executors.ex_2_blinov.main;

import examples.by.yurachel.multithreading.executors.ex_2_blinov.entity.BaseCallable;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Future<String>> list = new ArrayList<>();
            ExecutorService es = Executors.newFixedThreadPool(3);
            for (int i = 0; i < 6; i++) {
                list.add(es.submit(new BaseCallable()));
            }
            es.shutdown();
            for (Future<String> el : list) {
                System.out.println(el.get() + " result fixed");
            }

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
