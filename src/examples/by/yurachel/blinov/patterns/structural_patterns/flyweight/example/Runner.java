package examples.by.yurachel.blinov.patterns.structural_patterns.flyweight.example;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    private static final int SIZE = 4_000_000;

    public static void main(String[] args) {
        List<EuTermes> legion = new ArrayList<>();
        int i = 0;
        try {
            for (; i < SIZE; i++) {
                legion.add(new EuTermes("Worker", 12.3f, 10.1f, 5.0f));
            }
        } catch (OutOfMemoryError error) {
            System.err.println("out of memort error for Termes worker");
        } finally {
            System.out.println("Instance: " + i);
        }
    }
}
