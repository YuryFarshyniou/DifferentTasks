package examples.by.yurachel.blinov.patterns.creational_patterns.prototype.example;

public class Magazine extends Issue {
    private int number;

    public Magazine(Integer id, int number, String name, int year) {
        super(id, name, year);
        this.number = number;
    }
}
