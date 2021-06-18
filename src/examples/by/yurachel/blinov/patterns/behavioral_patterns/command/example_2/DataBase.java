package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example_2;

public class DataBase {
    public  void insert(){
        System.out.println("Inserting record...");
    }
    public void select(){
        System.out.println("Reading record...");
    }
    public void delete(){
        System.out.println("Deleting record....");
    }
    public void update(){
        System.out.println("Updating record...");
    }
}
