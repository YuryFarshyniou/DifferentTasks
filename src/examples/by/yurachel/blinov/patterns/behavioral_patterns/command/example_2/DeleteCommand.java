package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example_2;

public class DeleteCommand implements Command {
    DataBase db;

    public DeleteCommand(DataBase db) {
        this.db = db;
    }

    @Override
    public void execute() {
        db.delete();
    }
}
