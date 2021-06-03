package examples.by.yurachel.blinov.patterns.structural.bridge.example.action.impl;

import examples.by.yurachel.blinov.patterns.structural.bridge.example.action.Action;

public class RegularAction extends Action {
    private final static int MAX_SUM = 100;//read from base.
    private final static int NORMAL_INTEREST = 3;//read from base.


    @Override
    public double chargeInterest() {
        //charge NORMAL interest on account.
        return NORMAL_INTEREST;
    }

    @Override
    public double defineMaxSum() {
        //max sum is unbounded.
        return MAX_SUM;
    }

    @Override
    public double increasePayment() {

        return 0;//stub
    }
}
