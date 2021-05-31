package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.basic;

public class Context {
    private State state;

    public Context() {
        //Some code here.
    }

    public void changeStateRequest() {
        state.someAction();
    }
}
