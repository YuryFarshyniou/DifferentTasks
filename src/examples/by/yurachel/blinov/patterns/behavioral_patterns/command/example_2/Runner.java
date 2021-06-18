package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example_2;

public class Runner {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Developer developer = new Developer(
                new InsertCommand(db),
                new DeleteCommand(db),
                new SelectCommand(db),
                new UpdateCommand(db)
        );

        developer.insertRecord();

        developer.selectRecord();
        developer.updateRecord();
        developer.deleteRecord();

    }
}
