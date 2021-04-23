package java_rush_tasks.collections.lesson_2.task_3210.by.yurachel.raf_read.main;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            StringBuilder sb = readWithRAF(raf, Long.parseLong(args[1]), args[2]);
            writeWithRAF(raf, args[2], sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static StringBuilder readWithRAF(RandomAccessFile raf, long position, String text) throws IOException {
        StringBuilder sb = new StringBuilder();
        raf.seek(position);
        byte[] arr = new byte[text.length()];
        raf.read(arr, 0, text.length());
        for (byte b : arr) {
            sb.append((char) b);
        }

        return sb;
    }

    private static void writeWithRAF(RandomAccessFile raf, String text, StringBuilder sb) throws IOException {
        raf.seek(raf.length());
        if (text.equals(sb.toString())) {
            raf.write("true".getBytes());
        } else {
            raf.write("false".getBytes());
        }
    }
}
