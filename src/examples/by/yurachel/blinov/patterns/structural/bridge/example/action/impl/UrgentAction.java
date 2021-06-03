package examples.by.yurachel.blinov.patterns.structural.bridge.example.action.impl;

import examples.by.yurachel.blinov.patterns.structural.bridge.example.action.Action;

public class UrgentAction extends Action {
    final static int MONTHLY_PAYMENT = 10;//read from base.
    private final static int MAX_SUM = 50;//read from base.

    @Override
    public double chargeInterest() {
        //charge LOW interest on accounts.
        return 0;//stub
    }

    @Override
    public double defineMaxSum() {
        //check credit
        //max sum is bounded
        return MAX_SUM;
    }

    @Override
    public double increasePayment() {
        //MAX increase in monthly payments
        return MONTHLY_PAYMENT;
    }
}
