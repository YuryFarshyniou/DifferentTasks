package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.impl;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.CommandTypes;

public class Receiver {
    private Account account;
    private double amount;
    private static final double INTEREST_RATE = 9.5; // must be received from outside

    public Receiver(Account account) {
        this.account = account;
    }

    public void action(CommandTypes cmd) {
        switch (cmd) {
            case CREDITING: // realization CREDITING operation
                if (account.isBlocked()) {
                    System.out.println("Sorry,the account #" + account.getId() +
                            " is blocked! You can't credit charges to it.");
                } else {
                    double balance = account.getBalance();
                    balance *= INTEREST_RATE * 0.01;
                    System.out.println("Crediting is performed with " +
                            INTEREST_RATE + " % interest rate to the account #" +
                            account.getId());
                }
        }
    }
}
