package examples.by.yurachel.blinov.patterns.behavioral_patterns.iterator.example;

import java.util.HashMap;
import java.util.Map;

public class StudentSession implements Aggregate {
    private Map<String, Integer> exams = new HashMap<>();

    @Override
    public CustomIterator iterator() {
        CustomIterator iterator = new ExamsIterator(this);
        iterator.first();
        return iterator;
    }

    public void addExams(String name, Integer mark) {
        exams.put(name, mark);
    }

    public Integer getMark(String name) {
        return exams.get(name);
    }
    public Map<String,Integer> getExams(){
        return exams;
    }

}
