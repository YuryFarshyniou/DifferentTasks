package examples.by.yurachel.blinov.patterns.behavioral_patterns.memento.basic;
/*Позволяет зафиксировать и извлечь все свойства объекта (значения его полей)
с возможностью последующего восстановления объекта до данного состояния.Инкапсуляция объекта,
 для которого выполняется «моментальный снимок»,не нарушается.
Класс-создатель или Originator создает экземпляр Memento и оповещает
его о своем состоянии, и только он может сохранить и получить информацию
из объекта Memento. Ни один другой класс такой возможности не имеет.
Статический внутренний класс Memento, сохраняющий информацию об объ-
екте Originator. Класс Caretaker не знает об информации, сохраняемой в объек-
те Memento, но знает, почему и когда Originator может себя восстановить*/

// Сувенир,напоминание.
public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
