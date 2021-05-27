package examples.by.yurachel.blinov.patterns.creational_patterns.builder.example;

public class Runner {
    public static void main(String[] args) {
        User e1 = Director.createUser(new DOMBuilder());
        User e2 = Director.createUser(new SAXBuilder());

    }
}
