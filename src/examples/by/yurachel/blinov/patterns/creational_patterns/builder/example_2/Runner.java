package examples.by.yurachel.blinov.patterns.creational_patterns.builder.example_2;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website website = director.buildWebsite();
        System.out.println(website);
    }
}
