package examples.by.yurachel.blinov.patterns.behavioral_patterns.interpreter.example.expressions;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.interpreter.example.Context;

public class TerminalExpressionPlus extends AbstractMathExpression {
    @Override
    public void interpret(Context context) {
        context.pushValue(context.popValue() + context.popValue());
    }
}
