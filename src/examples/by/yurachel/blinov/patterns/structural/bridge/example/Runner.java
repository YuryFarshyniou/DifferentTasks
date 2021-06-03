package examples.by.yurachel.blinov.patterns.structural.bridge.example;

import examples.by.yurachel.blinov.patterns.structural.bridge.example.account.impl.CreditAccount;
import examples.by.yurachel.blinov.patterns.structural.bridge.example.account.impl.DepositAccount;
import examples.by.yurachel.blinov.patterns.structural.bridge.example.action.Action;
import examples.by.yurachel.blinov.patterns.structural.bridge.example.action.impl.RegularAction;
import examples.by.yurachel.blinov.patterns.structural.bridge.example.action.impl.UrgentAction;

/*Реализация больше не имеет постоянной привязки к интерфейсу. Реализацию
абстракции можно динамически изменять и конфигурировать во время выпол-
нения. Иерархии классов Abstraction и Implementor независимы и могут иметь
любое число подклассов.*/
public class Runner {
    public static void main(String[] args) {
        Action action = new RegularAction();
        DepositAccount depositAccount = new DepositAccount(action);
        depositAccount.setId(777);
        depositAccount.setAmount(1500);
        depositAccount.takeSum(200);
        action = new UrgentAction();
        depositAccount.setAction(action);//replacement action
        depositAccount.takeSum(100);
        new CreditAccount(action).takeSum(50);
    }
}
