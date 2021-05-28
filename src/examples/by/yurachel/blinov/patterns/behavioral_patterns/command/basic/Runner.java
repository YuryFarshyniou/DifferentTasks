package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.basic;

public class Runner {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Client client = new Client(receiver);
        ICommand commandOne = client.initCommand(TypeCommand.ONE);
        Invoker invokeOne = new Invoker(commandOne);
        invokeOne.invokeCommand();
        ICommand commandTwo = client.initCommand(TypeCommand.TWO);
        Invoker invokeTwo = new Invoker(commandTwo);
        invokeTwo.invokeCommand();
    }
}
