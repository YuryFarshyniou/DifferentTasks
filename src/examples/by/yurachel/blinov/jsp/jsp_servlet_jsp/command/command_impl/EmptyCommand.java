package examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command.command_impl;

import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command.ActionCommand;
import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.resources.ConfigurationManager;
import jakarta.servlet.http.HttpServletRequest;

/* Команда EmptyCommand будет выполнена,если к сервлету произошло обращение без команды.В дальнейшем такой
действие будет лишним,так как будут показаны возможности блокировки запроса,не соответствующего тре-
бованиям логики приложения.
* */
public class EmptyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        /*В случае ошибки или прямого обращения к контроллеру
        переадресация на страницу ввода логина.
        * */
        return ConfigurationManager.getProperty("path.page.login");
    }
}
