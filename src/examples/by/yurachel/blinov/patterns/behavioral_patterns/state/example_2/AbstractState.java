package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_2;

/*Объявление внешних интерфейса и абстрактного класса для внутреннего
класса необходимо для организации более удобного процесса управления со-
стоянием из внешнего класса, если такое понадобится.*/
public abstract class AbstractState implements IState {
    protected IState nextState;
}
