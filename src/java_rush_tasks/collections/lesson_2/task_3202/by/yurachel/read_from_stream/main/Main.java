package java_rush_tasks.collections.lesson_2.task_3202.by.yurachel.read_from_stream.main;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (StringWriter writer = getAllDataFromInputStream(new FileInputStream("F:\\Downloads\\Movies\\test.txt"))) {
            System.out.println(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        StringWriter sw = new StringWriter();
        if (is == null) {
            return sw;
        }
        BufferedInputStream bis = new BufferedInputStream(is);
        StringBuilder sb = new StringBuilder();
        while (bis.available() > 0) {
            sb.append((char) bis.read());
        }
        sw.write(sb.toString());
        return sw;
    }
}
