package examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example_3;

public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system develop in progress");
        developer.writeCode();
    }
}
