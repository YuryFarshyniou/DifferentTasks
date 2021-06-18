package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example_2;

public class InsertCommand implements Command {
    DataBase db;

    public InsertCommand(DataBase db) {
        this.db = db;
    }

    @Override
    public void execute() {
        db.insert();
    }
}
