package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.basic;

public class CommandTwo implements ICommand {
    private Receiver receiver;

    public CommandTwo(Receiver reciever) {
        this.receiver = reciever;
    }

    @Override
    public void execute() {
        System.out.println("Determine connection between receiver and action");
        receiver.action(TypeCommand.TWO);
    }
}
