package examples.by.yurachel.blinov.patterns.structural_patterns.adapter.basic;

/*Класс Client может взаимодействовать только с экземплярами, реализую-
щими интерфейс Adapter. Экземпляр класса Client, вызывая метод execute(),
не будет знать, метод какого класса он вызывает — основного или адаптиру-
емого. Предназначение шаблона Adapter — без серьезной переработки сис-
темы включить необходимый функционал в общем случае несовместимый
с существующим.*/

import examples.by.yurachel.blinov.patterns.structural_patterns.adapter.basic.Adapter;

/*Адаптируемый класс Adaptee. */
public class Client {
    private Adapter adapter;

    public Client(Adapter adapter) {
        this.adapter = adapter;
    }
    public void execute(){
        adapter.request();
    }
}
