package examples.by.yurachel.multithreading.executors.ex_2_blinov.entity;

import java.util.ArrayDeque;

public class ProductList {
    private static ArrayDeque<String> arr = new ArrayDeque<String>() {
        {
            this.add("Product 1");
            this.add("Product 2");
            this.add("Product 3");
            this.add("Product 41");
            this.add("Product 51");
            this.add("Product 6");

        }
    };

    public static String getProduct() {
        return arr.poll();
    }
}
