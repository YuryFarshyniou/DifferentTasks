package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.impl;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.CommandTypes;
import examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.ICommand;
import examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example.Receiver;

public class BlockingCommand implements ICommand {
    private Receiver receiver;

    public BlockingCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action(CommandTypes.BLOCKiNG);
    }
}
