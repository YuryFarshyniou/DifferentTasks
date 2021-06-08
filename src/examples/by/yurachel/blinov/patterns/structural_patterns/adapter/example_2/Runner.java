package examples.by.yurachel.blinov.patterns.structural_patterns.adapter.example_2;

public class Runner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}
