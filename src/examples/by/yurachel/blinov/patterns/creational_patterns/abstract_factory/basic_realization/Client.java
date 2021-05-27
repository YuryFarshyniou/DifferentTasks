package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.basic_realization;

public class Client {
    private AbstractFactory abstractFactory;
    private AbstractProduct abstractProduct;
    public void action(){
        abstractProduct = abstractFactory.createProduct();
        abstractProduct.info();
    }

    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }
}
