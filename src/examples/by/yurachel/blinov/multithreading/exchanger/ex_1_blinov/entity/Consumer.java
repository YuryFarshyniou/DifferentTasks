package examples.by.yurachel.blinov.multithreading.exchanger.ex_1_blinov.entity;

public class Consumer extends Subject implements Runnable {
    public Consumer(String name, Item item) {
        super(name, item);
    }


    @Override
    public void run() {
        try {
            synchronized (item) {
                int requiredNumber = item.getNumber();
                item = exchanger.exchange(item);
                if (requiredNumber >= item.getNumber()) {
                    System.out.println("Consumer " + getName() + " increases");
                } else {
                    System.out.println("Consumer " + getName() + " decreases");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
