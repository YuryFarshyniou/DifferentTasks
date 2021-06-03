package examples.by.yurachel.blinov.patterns.behavioral_patterns.interpreter.example;

public class InterpreterRunner {
    public static void main(String[] args) {
        String expression = "8 2 7 4 + * -";//Expression in polska for.
        Client interpreter = new Client(expression);
        System.out.println("[" + expression + "] = " + interpreter.calculate());
    }
}
