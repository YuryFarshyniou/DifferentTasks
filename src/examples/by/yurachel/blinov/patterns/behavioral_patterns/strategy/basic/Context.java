package examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.basic;

/*Все алгоритмы полностью реализуются в подклассах Strategy так, что все
алгоритмы внешне отличаются только по названиям классов, их инкапсулиру-
ющих. Для смены алгоритма достаточно изменить объект в поле класса
Context.
// # 57 # контекст*/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithm();
    }
}
