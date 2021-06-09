package examples.by.yurachel.blinov.patterns.structural_patterns.proxy.basic;

public class Proxy implements BaseInterface {
    private BaseClass baseClass = null;

    @Override
    public void perform() {
        baseClass = new BaseClass();
        baseClass.perform();
    }
}
