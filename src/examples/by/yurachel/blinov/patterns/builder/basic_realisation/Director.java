package examples.by.yurachel.blinov.patterns.builder.basic_realisation;

public class Director {
    private Builder builder; // unnecessary field.

    public Director(String builderMode) {
        // init builder.
    }

    public Product construct(String sourceName) {
        // reading date.
        builder.buildPart1(0);
        builder.buildPart2("some");
        return builder.getResult();
    }

}
