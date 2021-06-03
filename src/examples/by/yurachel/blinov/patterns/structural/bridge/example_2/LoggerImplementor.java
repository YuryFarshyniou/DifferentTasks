package examples.by.yurachel.blinov.patterns.structural.bridge.example_2;

/*Ниже приведен более простой пример использования шаблона Bridge при
создании собственного логгера. Реализация может быть применена и для раз-
работки с собственным псевдо-логгером.
/* # 6 # Implementors # LoggerImplementor.java #*/
public interface LoggerImplementor {
    void logToConsole();
    void logToFile();
    void logToSocket();
}
