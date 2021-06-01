package examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.example_2;


import java.util.HashMap;
import java.util.Map;

/*Использование шаблона позволяет отказаться от условных операторов при
выборе нужного поведения. Стратегии могут предлагать различные реализа-
ции одного
и того же поведения. Класс-клиент вправе выбирать подходящую
стратегию в зависимости от своих требований. Класс Context инкапсулирует
алгоритмы в виде динамически изменяемого набора пар «ключ-алгоритм»,
но при обязательном наличии ненулевого алгоритма по умолчанию.*/
public class Context {
    public final static int DEFAULT_ALGORITHM = 0;
    private Map<Integer, Strategy> algorithms = new HashMap<>();

    public Context(Strategy strategy) {
        //Checking for null.
        algorithms.put(DEFAULT_ALGORITHM, strategy);
    }

    public Context() {
        this(new DefaultStrategy());
    }

    public void registerAlgorithm(int key, Strategy strategy) {
        if (key != 0) {
            algorithms.put(key, strategy);
        }
    }

    public void registerDefaultAlgorithm(int key, Strategy strategy) {
        //Checking for null
        algorithms.put(DEFAULT_ALGORITHM, strategy);
    }
    public void contextStrategy(int key){
        algorithms.get(key).doAlgorithm();
    }
}