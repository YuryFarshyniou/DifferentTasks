package examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.factory;

import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command.ActionCommand;
import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command.command_impl.EmptyCommand;
import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.resources.MessageManager;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Locale;


/* По окончанию выполнения команд бизнес-логики,полученные данные слудет передать в request
для передачи клиенту.В такой ситуации метод defineCommand() в качестве параметра должен будет
объявлять класс SessionRequestContent, а не HttpServletRequest.
* */

public class ActionFactory {
    public ActionCommand defineCommand(HttpServletRequest request) {
        ActionCommand current = new EmptyCommand();
        //Извлечение имени команды из запроса.
        String action = request.getParameter("command");
        if (action == null || action.isEmpty()) {
            //если команда не нужна в текущем запросе.
            return current;
        }
        //Получение объекта ,соответствующего команде.
        try {
            CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase(Locale.ROOT));
            current = currentEnum.getCurrentCommand();
        } catch (IllegalArgumentException e) {
            request.setAttribute("wrongAction", action +
                    MessageManager.getProperty("message.wrongAction"));
        }
        return current;
    }
}
