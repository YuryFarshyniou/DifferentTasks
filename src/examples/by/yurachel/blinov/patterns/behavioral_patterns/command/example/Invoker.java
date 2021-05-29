package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.example;


/*Класс Invoker непосредственно вызывает команду для выполнения.*/
public class Invoker {
    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void InvokeCommand() {
        System.out.println("Refer to command for execution.");
        command.execute();
    }
}
