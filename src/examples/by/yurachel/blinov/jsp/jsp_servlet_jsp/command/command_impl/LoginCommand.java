package examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command.command_impl;

import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.LoginLogic;
import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command.ActionCommand;
import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.resources.ConfigurationManager;
import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.resources.MessageManager;
import jakarta.servlet.http.HttpServletRequest;

public class LoginCommand implements ActionCommand {
    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        //Извлечение из запроса логина и пароля.
        String login = request.getParameter(PARAM_NAME_LOGIN);
        String pass = request.getParameter(PARAM_NAME_PASSWORD);
        //Проверка логина и пароля.
        if (LoginLogic.checkLogin(login, pass)) {
            request.setAttribute("user", login);
            //определение пути к main.jsp.
            page = ConfigurationManager.getProperty("path.page.main");
        } else {
            request.setAttribute("errorLoginPassMessage",
                    MessageManager.getProperty("message.loginError"));
            page = ConfigurationManager.getProperty("path.page.login");
        }
        return page;
    }
}
