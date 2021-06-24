package examples.by.yurachel.blinov.patterns.behavioral_patterns.interpreter.example2;

public class Runner {
    public static void main(String[] args) {
        Expression isJava =getJavaExpression();
        Expression isJavaEeDeveloper = getJavaEeExpression();
        System.out.println("Does developer know java core " + isJava.interpret("java Core"));
        System.out.println("Does developer know java ee " + isJavaEeDeveloper.interpret("java spring"));

    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("java Core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEeExpression() {
        Expression java = new TerminalExpression("java");
        Expression spring = new TerminalExpression("java spring");
        return new AndExpression(java, spring);
    }
}
