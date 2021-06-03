package examples.by.yurachel.blinov.patterns.structural.bridge.example.account.impl;

import examples.by.yurachel.blinov.patterns.structural.bridge.example.account.Account;
import examples.by.yurachel.blinov.patterns.structural.bridge.example.action.Action;

public class CreditAccount extends Account {
    private double limitCredit;

    public double getLimitCredit() {
        return limitCredit;
    }

    public void setLimitCredit(double limitCredit) {
        this.limitCredit = limitCredit;
    }

    public CreditAccount(Action action) {
        super(action);
    }

    @Override
    public boolean takeSum(double sum) {
        System.out.println("performing by credit account");
        double maxSum = getAction().defineMaxSum();
        double payment = getAction().increasePayment();
        System.out.println("AccountId: " + getId() + " increase monthly payments: " + payment);
        System.out.println("recording of changes in the state account.");
        System.out.println("withdraw" + sum);
        return false;
    }
}
