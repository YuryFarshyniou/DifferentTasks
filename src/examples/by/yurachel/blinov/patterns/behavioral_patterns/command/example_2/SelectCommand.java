package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example_2;

public class SelectCommand implements Command{
    DataBase db;

    public SelectCommand(DataBase db) {
        this.db = db;
    }

    @Override
    public void execute() {
        db.select();
    }
}
