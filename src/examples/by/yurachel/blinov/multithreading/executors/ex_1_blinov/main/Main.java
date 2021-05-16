package examples.by.yurachel.blinov.multithreading.executors.ex_1_blinov.main;

import examples.by.yurachel.blinov.multithreading.executors.ex_1_blinov.entity.CallCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        // ExecutorService методом execute(Runnable thread) запускает традиционные потоки.
        ExecutorService es = Executors.newSingleThreadExecutor(); // newSingleThreadExecutor() позволяет исполнителю запускать только один поток,
        // newFixedThreadPool(int numThreads)не более чем numThreads.

        // Interface Future - Обобщенный интерфейс и представляет значение,возвращаемое объектом типа Callable
        Future<Number> future = es.submit(new CallCallable()); // Метод submit(Callable<T> ex) запускает потоки с возвращаемым значением.
        es.shutdown(); // Метод shutdown() останавливает все запущенные им ранее потоки и прекращает действие самого исполнителя.
        try {
            System.out.println(future.get()); // Используется для получения значения .
        } catch (InterruptedException | ExecutionException exception) {
            exception.getStackTrace();
        }
    }
}
