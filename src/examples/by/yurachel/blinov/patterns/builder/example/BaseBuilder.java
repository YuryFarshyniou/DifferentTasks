package examples.by.yurachel.blinov.patterns.builder.example;

public abstract class BaseBuilder {
    protected User user = new User();

    public User getUser() {
        return user;
    }
    public abstract void buildLogin();
    public abstract void buildPassword();
    // public abstract void buildUser() // possibly like an option
}
