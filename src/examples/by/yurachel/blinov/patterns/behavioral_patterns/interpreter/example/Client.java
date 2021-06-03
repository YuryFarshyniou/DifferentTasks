package examples.by.yurachel.blinov.patterns.behavioral_patterns.interpreter.example;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.interpreter.example.expressions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private List<AbstractMathExpression> list;

    public Client(String expression) {
        list = new ArrayList<>();
        parse(expression);
    }

    private void parse(String expression) { // синтаксический анализ.
        for (String lexeme : expression.split("\\p{Blank}+")) {
            if (lexeme.isEmpty()) {
                continue;
            }
            char temp = lexeme.charAt(0);
            switch (temp) {
                case '+':
                    list.add(new TerminalExpressionPlus());
                    break;
                case '-':
                    list.add(new TerminalExpressionMinus());
                    break;
                case '*':
                    list.add(new TerminalExpressionMultiply());
                    break;
                case '/':
                    list.add(new TerminalExpressionDivide());
                    break;
                default:
                    Scanner scan = new Scanner(lexeme);
                    if (scan.hasNextInt()) {
                        list.add(new NonterminalExpressionNumber(scan.nextInt()));
                    }
            }
        }
    }

    public Number calculate() {
        Context context = new Context();
        //Выполнение простыъ задач и сборка результата.
        for (AbstractMathExpression terminal : list) {
            terminal.interpret(context);
        }
        return context.popValue();
    }
}
