package examples.by.yurachel.blinov.patterns.structural_patterns.proxy.basic;

public class Runner {
    public static void main(String[] args) {
        BaseInterface base = new Proxy();
        base.perform();
    }
}
