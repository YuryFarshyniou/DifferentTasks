package examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example_3;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }
    public abstract void developProgram();
}
