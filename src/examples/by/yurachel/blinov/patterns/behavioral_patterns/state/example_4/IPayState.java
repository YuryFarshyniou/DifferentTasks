package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_4;

/*В конце раздела приведена реализация шаблона State для проверки процес-
са оплаты заказа и выставления штрафных санкций в случае задержки оплаты.
Данную реализацию следует в качестве упражнения попробовать переделать,
заменив поле IPayState класса order на поле типа boolean и оценить, как это
отразится на организации класса и способах вычисления сумм к оплате.*/
public interface IPayState {
    public void check(Order order);

    public void purchase(Order order);
}
