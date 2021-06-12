package examples.by.yurachel.blinov.patterns.creational_patterns.builder.example_2;

public class Website {
    private String name;
    private Cms cms;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", Cms=" + cms +
                ", price=" + price +
                '}';
    }
}
