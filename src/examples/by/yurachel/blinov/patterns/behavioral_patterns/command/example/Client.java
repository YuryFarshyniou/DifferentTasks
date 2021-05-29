package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.impl.BlockingCommand;
import examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.impl.CreditingCommand;
import examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.impl.WithdrawingCommand;

/*Класс Client создает для каждой операции свой экземпляр receiver. */
public class Client {
    private Receiver receiver;

    public Client(Receiver receiver) {
        this.receiver = receiver;
    }

    public ICommand initCommand(CommandTypes cmd) {
        ICommand command = null;

        switch (cmd) {
            case CREDITING:
                System.out.println("Creating command Crediting & set up its receiver.");
                command = new CreditingCommand(receiver);
                break;
            case WITHDRAWING:
                System.out.println("Creating command Withdrawing & set up its receiver.");
                command = new WithdrawingCommand(receiver);
                break;
            case BLOCKiNG:
                System.out.println("Creating command Blocking & set up its receiver.");
                command = new BlockingCommand(receiver);
                break;
        }
        return command;
    }
}
