package examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example.account.impl;

import examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example.account.Account;
import examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example.action.Action;

public class DepositAccount extends Account {
    public DepositAccount(Action action) {
        super(action);
    }

    @Override
    public boolean takeSum(double sum) {
        System.out.println("Performing by deposit account");
        double interest = getAction().chargeInterest();
        double maxSum = getAction().defineMaxSum();
        //check amount.
        System.out.println("accountID: " + getId() + " interest is " + interest);
        System.out.println("recording of changes in the state account");
        System.out.println("withdraw" + sum);
        return true;
    }
}
