package examples.by.yurachel.blinov.patterns.creational_patterns.builder.basic_realisation;

public interface Builder {
    Product getResult();

    void buildPart1(int part1);

    void buildPart2(String part2);
}
