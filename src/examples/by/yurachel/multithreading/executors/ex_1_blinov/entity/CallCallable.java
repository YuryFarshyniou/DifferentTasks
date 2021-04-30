package examples.by.yurachel.multithreading.executors.ex_1_blinov.entity;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallCallable implements Callable<Number> {  // Интерфейс Callable представляет значение вызывающему потоку.

    @Override
    public Number call() throws Exception { // Interface Callable определяет один метод call,в тело которго необходимо поместить задачу.
        Number res =new Random().nextGaussian();
        return res;
    }
}
