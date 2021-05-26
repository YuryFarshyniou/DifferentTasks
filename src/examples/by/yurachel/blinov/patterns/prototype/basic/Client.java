package examples.by.yurachel.blinov.patterns.prototype.basic;

public class Client {
    private Prototype prototype;
    public void operation(){
        Prototype instance = prototype.clonePrototype();
        // actions with clone.
    }
}
