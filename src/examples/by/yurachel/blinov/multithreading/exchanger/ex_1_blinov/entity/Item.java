package examples.by.yurachel.blinov.multithreading.exchanger.ex_1_blinov.entity;

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
