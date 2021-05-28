package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.basic;

public class CommandOne implements ICommand {
    private Receiver receiver;

    public CommandOne(Receiver reciever) {
        this.receiver = reciever;
    }

    @Override
    public void execute() {
        System.out.println("determine connection between receiver and action");
        receiver.action(TypeCommand.ONE);
    }
}
