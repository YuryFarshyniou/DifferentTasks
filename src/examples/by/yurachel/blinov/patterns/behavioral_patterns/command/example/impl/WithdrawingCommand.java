package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.impl;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.CommandTypes;
import examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.ICommand;

public class WithdrawingCommand implements ICommand {
    private Receiver receiver;

    public WithdrawingCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action(CommandTypes.WITHDRAWING);
    }
}
