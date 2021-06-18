package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example_2;

public class UpdateCommand implements Command{
    DataBase db ;

    public UpdateCommand(DataBase db) {
        this.db = db;
    }

    @Override
    public void execute() {
        db.update();
    }
}
