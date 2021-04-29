package examples.by.yurachel.multithreading.exchanger.entity;

public class Producer extends Subject implements Runnable {


    public Producer(String name, Item item) {
        super(name, item);
    }

    @Override
    public void run() {
        synchronized (item) {
            try {
                int proposedNumber = this.getItem().getNumber();
                // Обмен синхронизированными экземплярами.
                item = exchanger.exchange(item); // Exchanger предоставляет всего один метод exchange.
                if (proposedNumber <= item.getNumber()) {
                    System.out.println("Producer " + getName() + " increased");
                }else{
                    System.out.println("Producer " + getName() + " decreased");
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
