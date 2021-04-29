package java_rush_tasks.collections.lesson_3.task_3313.by.yurachel.date_json.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java_rush_tasks.collections.lesson_3.task_3313.by.yurachel.date_json.entity.Event;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Event event = new Event("event#1");

        String result = new ObjectMapper().writeValueAsString(event);

        System.out.println(result);
    }
}
