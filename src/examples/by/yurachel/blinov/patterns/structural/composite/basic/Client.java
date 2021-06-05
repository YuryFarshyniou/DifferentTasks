package examples.by.yurachel.blinov.patterns.structural.composite.basic;

/*Клиентский класс(необязателен)*/

public class Client {
    private Component component;

    public Client(Component component) {
        this.component = component;
    }

    public void execute() {
        component.operation();
    }
}
