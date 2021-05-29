package examples.by.yurachel.blinov.patterns.behavioral_patterns.mediator.basic;

public class ConcreteMediator implements Mediator {
    private ConcreteColleagueOne concreteColleagueOne;
    private ConcreteColleagueTwo concreteColleagueTwo;

    public ConcreteMediator() {
        this.concreteColleagueOne = new ConcreteColleagueOne();
        this.concreteColleagueTwo = new ConcreteColleagueTwo();
    }

    @Override
    public void setTrue() {
        concreteColleagueOne.changeFlag(true);
        concreteColleagueTwo.changeFlag(true);
        System.out.println("Both set to true.");
    }

    @Override
    public void setFalse() {
        concreteColleagueOne.changeFlag(false);
        concreteColleagueTwo.changeFlag(false);
        System.out.println("Both set ot false.");
    }

    @Override
    public void setDifferent() {
        concreteColleagueOne.changeFlag(false);
        concreteColleagueTwo.changeFlag(true);
        System.out.println("First - false, second - true.");
    }
}
