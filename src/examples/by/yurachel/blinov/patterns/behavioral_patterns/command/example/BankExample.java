package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example;

public class BankExample {
    public static void main(String[] args) {
        Account account = new Account(123, 1100, false);
        Receiver receiver = new Receiver(account);

        Client client = new Client(receiver);

        ICommand commandCrediting = client.initCommand(CommandTypes.CREDITING);
        Invoker invokerCrediting = new Invoker(commandCrediting);
        invokerCrediting.InvokeCommand();

        ICommand commandWithdrawing = client.initCommand(CommandTypes.WITHDRAWING);
        Invoker invokerWithdrawing = new Invoker(commandWithdrawing);
        invokerWithdrawing.InvokeCommand();

        ICommand commandBlocking = client.initCommand(CommandTypes.BLOCKiNG);
        Invoker invokerBlocking = new Invoker(commandBlocking);
        invokerBlocking.InvokeCommand();
    }
}
