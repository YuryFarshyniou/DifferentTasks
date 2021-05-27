package examples.by.yurachel.blinov.patterns.creational_patterns.builder.example;

public class Director {
    public static User createUser(BaseBuilder builder) {
        builder.buildLogin();
        builder.buildPassword();
        return builder.getUser();
    }
}
