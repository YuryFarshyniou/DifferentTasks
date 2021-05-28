package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.basic;

public class Invoker {
    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }
    public void invokeCommand(){
        System.out.println("Refer to command for execution");
        command.execute();
    }
}
