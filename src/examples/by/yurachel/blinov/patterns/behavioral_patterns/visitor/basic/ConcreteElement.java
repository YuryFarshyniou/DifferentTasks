package examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.basic;

public class ConcreteElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
