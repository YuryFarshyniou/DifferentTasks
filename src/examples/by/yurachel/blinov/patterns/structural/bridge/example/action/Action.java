package examples.by.yurachel.blinov.patterns.structural.bridge.example.action;

/*Класс Action — абстрактный, реализующий Implementor (IAction). Может
содержать общие методы для всех действий, например: проверку прав пользо-
вателя, блокировку счета и т. д. Классы RegularAction и UrgentAction уточня-
ют подклассы класса Action.*/
public abstract class Action implements IAction {
    //Fields and methods common for all realizations.
    public void operation() {
        //more code
    }

}
