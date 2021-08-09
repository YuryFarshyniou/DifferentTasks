package examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example_3;

public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange in progress");
        developer.writeCode();
    }
}
