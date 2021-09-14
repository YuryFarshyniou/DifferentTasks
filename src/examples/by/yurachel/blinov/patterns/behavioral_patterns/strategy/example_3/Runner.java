package examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.example_3;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        List<String> list= new ArrayList<>(Arrays.asList("yura","hello"));
        list.stream().а
        Developer developer = new Developer();
        developer.setActivity(new Sleeping());
        developer.executeActivity();
        developer.setActivity(new Training());
        developer.executeActivity();
        developer.setActivity(new Coding());
        developer.executeActivity();
        developer.setActivity(new Reading());
        developer.executeActivity();

        Activity activity = new Sleeping();


    }
}
