package examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command.command_impl;

import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command.ActionCommand;
import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.resources.ConfigurationManager;
import jakarta.servlet.http.HttpServletRequest;


/*Выход из системы и уничтожение сессии.*/
public class LogoutCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.index");
        //уничтожение сессии.
        request.getSession().invalidate();
        return page;
    }
}
