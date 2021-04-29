package examples.by.yurachel.multithreading.exchanger.entity;

public class Item {
    private Integer id;
    private Integer number;

    public Item(Integer id, Integer number) {
        super();
        this.id = id;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }
}
