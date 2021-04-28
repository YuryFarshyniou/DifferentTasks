package java_rush_tasks.collections.lesson_3.task_3303.by.yurachel.deser_json.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
        ObjectMapper om = new ObjectMapper();

        return om.readValue(new File(fileName), clazz);
    }
    public static void main(String[] args) {

    }
}
