package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_2;

/*Объявление класов-состояний можно перенести внутрь класса Context.
Действие будет вполне правомерным, так как соятояния являются логической
и неотделимой частью класса-контекста. В системе управления образованием.
состояние объекта класса Учебный курс в процессе обучения могут изменяться
по правилам, приведенным на диаграмме состояний. Из некоторых состояний,
в отличие от примера с соединениями, перейти в другое состояние невозмож-
но. Например, нельзя отменить уже начавшийся курс или стартовать его еще
раз, если процесс обучения уже начат.*/
public interface IState {
    void learning();
    void toCancel();
}
