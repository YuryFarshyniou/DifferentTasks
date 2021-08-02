package examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example2;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Drop db..");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable tests...");
    }
}
