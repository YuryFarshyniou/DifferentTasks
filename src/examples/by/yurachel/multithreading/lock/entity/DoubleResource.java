package examples.by.yurachel.multithreading.lock.entity;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DoubleResource {
    private Deque<String> list = new LinkedList<>();
    private Lock lock = new ReentrantLock(); // Lock - интерфейс.
    private Condition isFree = lock.newCondition(); // Класс Condition предназначен для управления блокировкой.Ссылку на эземпляр можно получить только из объекта Lock.

    public void adding(String str, int i) {

        try {
            lock.lock(); // Получает блокировку экземпляра.
            list.add(i + "<" + str);
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(50)); // Представляет различные единицы измерения времени.ENUM.Методы:sleep(),timedJoin(),timedWait().
            isFree.signal();  // Подобен действию методы notify() класса Object.

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // Освобождает блокировку экземпляра.
        }
    }

    public String deleting(){
        lock.lock();
        String s = list.poll(); // метод poll() забирает и удаляет головной элемент очереди.
        s+=list.poll();
        isFree.signal();
        lock.unlock();
        return s;
    }
    public String toString(){
        return list.toString();
    }
}
