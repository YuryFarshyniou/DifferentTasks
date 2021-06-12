package examples.by.yurachel.blinov.patterns.creational_patterns.builder.example_2;

public abstract class Builder {
    Website website;

    void createWebsite() {
        website = new Website();
    }
    abstract void buildCms();
    abstract void buildName();
    abstract void buildPrice();

    public Website getWebsite() {
        return website;
    }
}
