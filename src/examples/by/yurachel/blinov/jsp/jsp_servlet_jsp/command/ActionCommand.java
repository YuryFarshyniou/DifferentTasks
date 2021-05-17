package examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command;

import jakarta.servlet.http.HttpServletRequest;

/* Выполнение всех команд будет осуществляться при помощт реализации шаблона Command.Интерфейс ActionCommand
определяет одно действие execute(), реализации интерфейса определяет в имплементированном методе бизнес-логику
выполнеия соответствующей команды.
* */

public interface ActionCommand {
    String execute(HttpServletRequest request);
}
