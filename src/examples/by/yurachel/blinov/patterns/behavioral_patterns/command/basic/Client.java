package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.basic;

public class Client {
    private Receiver receiver;

    public Client(Receiver receiver) {
        this.receiver = receiver;
    }

    public ICommand initCommand(TypeCommand cmd) {
        ICommand command = null;
        switch (cmd) {
            case ONE:
                System.out.println("Creating command OnE and set up its receiver");
                command = new CommandOne(receiver);
                break;
            case TWO:
                System.out.println("Creating command TWO and set up its receiver.");
                command = new CommandTwo(receiver);
                break;
        }
        return command;
    }
}
