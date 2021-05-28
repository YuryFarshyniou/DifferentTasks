package examples.by.yurachel.blinov.patterns.behavioral_patterns.command.basic;

public class Receiver {
    public void action(TypeCommand command){
        switch(command){
            case ONE:
                System.out.println("Know the information to complete request One");
                break;
            case TWO:
                System.out.println("Know the information to complete request Two");
                break;
        }
    }
}
