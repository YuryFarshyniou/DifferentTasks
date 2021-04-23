package java_rush_tasks.collections.lesson_2.task_3203.by.yurachel.stack_trace.main;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        String text = getStackTrace(new IndexOutOfBoundsException("fff"));
        System.out.println(text);
    }

    public static String getStackTrace(Throwable throwable) {
        StringWriter sw = new StringWriter();
        throwable.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }

}
