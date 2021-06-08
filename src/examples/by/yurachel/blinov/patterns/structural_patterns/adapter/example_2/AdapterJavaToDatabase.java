package examples.by.yurachel.blinov.patterns.structural_patterns.adapter.example_2;

public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }

    @Override
    public void select() {
        loadObject();
    }
}
