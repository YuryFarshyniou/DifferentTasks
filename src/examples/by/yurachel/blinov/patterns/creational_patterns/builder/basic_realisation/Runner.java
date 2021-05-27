package examples.by.yurachel.blinov.patterns.creational_patterns.builder.basic_realisation;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director("Concrete");
        Product prod = director.construct("sourcePath");
    }
}
