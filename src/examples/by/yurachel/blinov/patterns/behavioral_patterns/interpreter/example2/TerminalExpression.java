package examples.by.yurachel.blinov.patterns.behavioral_patterns.interpreter.example2;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);

    }
}
