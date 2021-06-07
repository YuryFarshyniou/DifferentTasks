package examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example.account;

import examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example.action.Action;

public abstract class Account {
    private int id;
    private double amount;
    private Action action;

    protected Account(Action action) {
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public abstract boolean takeSum(double sum);
}
