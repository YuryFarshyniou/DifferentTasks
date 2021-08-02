package examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example2;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after Junior.. ");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Fixing db...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable tests...");
    }
}
