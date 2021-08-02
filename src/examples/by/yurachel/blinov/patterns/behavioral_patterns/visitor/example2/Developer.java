package examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example2;

public interface Developer {
    void create(ProjectClass projectClass);
    void create(DataBase dataBase);
    void create(Test test);

}
