package examples.by.yurachel.blinov.patterns.behavioral_patterns.interpreter.example.expressions;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.interpreter.example.Context;

public class NonterminalExpressionNumber extends AbstractMathExpression{
    private int number;

    public NonterminalExpressionNumber(int number) {
        this.number = number;
    }

    @Override
    public void interpret(Context context) {
        context.pushValue(number);
    }
}
