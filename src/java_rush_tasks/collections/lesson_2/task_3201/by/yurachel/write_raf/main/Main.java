package java_rush_tasks.collections.lesson_2.task_3201.by.yurachel.write_raf.main;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            writeWithRAF(raf, Long.parseLong(args[1]), args[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeWithRAF(RandomAccessFile raf, long point, String text) throws IOException {
        long number = Math.min(point, raf.length());
        raf.seek(number);
        raf.write(text.getBytes());
    }

}
