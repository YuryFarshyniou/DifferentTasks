package examples.by.yurachel.blinov.patterns.behavioral_patterns.memento.basic;
/*Сохранение и восстановление состояния.*/
public class Runner {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker caretaker = new CareTaker(originator.createMemento());
        System.out.println(originator);
        originator.execute();
        System.out.println(originator);
        originator.setMemento(caretaker.getMemento());
        System.out.println(originator);
    }
}
