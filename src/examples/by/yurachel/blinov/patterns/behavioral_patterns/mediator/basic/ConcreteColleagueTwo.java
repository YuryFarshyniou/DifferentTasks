package examples.by.yurachel.blinov.patterns.behavioral_patterns.mediator.basic;

public class ConcreteColleagueTwo implements Colleague {
    private boolean flag;

    @Override
    public void changeFlag(boolean flag) {
        this.flag = flag;
    }
}
