package examples.by.yurachel.blinov.patterns.creational_patterns.builder.example_2;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    Website buildWebsite() {
        builder.createWebsite();
        builder.buildCms();
        builder.buildName();
        builder.buildPrice();
        return builder.getWebsite();
    }
}
