package examples.by.yurachel.blinov.patterns.creational_patterns.builder.basic_realisation;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public Product getResult() {
        return product;
    }

    @Override
    public void buildPart1(int part1) {
//realization
        product.setPart1(part1);
    }

    @Override
    public void buildPart2(String part2) {
// realization
        product.setPart2(part2);
    }
}
