package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.CommandTypes;


/*Класс Receiver асполагает информацией ос способах выполнения операций. */
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
                break;
            case WITHDRAWING:
                if (account.isBlocked()) {
                    System.out.println("Sorry,the account #" + account.getId() +
                            " is blocked! You can't withdraw money to it.");
                } else {
                    double balance = account.getBalance();
                    balance -= amount;
                    account.setBalance(balance);
                    System.out.println(amount + " is withdrawed from the account #" +
                            account.getId());
                }
                break;
            case BLOCKiNG:
                if (account.isBlocked()) {
                    account.setBlocked(false);
                    System.out.println("The account #" + account.getId() +
                            " is unblocked");
                } else {
                    account.setBlocked(true);
                    System.out.println("The account #" + account.getId() +
                            " is blocked");
                }
                break;
        }
    }
}
