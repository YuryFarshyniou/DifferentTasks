package examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.controller;

import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.factory.ActionFactory;
import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command.ActionCommand;
import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.resources.ConfigurationManager;
import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.resources.MessageManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/controller")
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = null;
        //определение команды,пришедшей из JSP.
        ActionFactory client = new ActionFactory();
        ActionCommand command = client.defineCommand(req);

        /* Вызов реализованного метода execute() и передача параметров
        классу-обработчику конкретной команды.
                */
        page = command.execute(req);

        // метод возвращает страницу ответа.
        // page = null;
        if (page != null) {
            //Вызов страницы ответа на запрос.
            getServletContext().getRequestDispatcher(page).forward(req, resp);
        } else {
            //утсановка страницы с сообщением об ошибке.
            page = ConfigurationManager.getProperty("path.page.index");
            req.getSession().setAttribute("nullPage",
                    MessageManager.getProperty("message.nullPage"));
            resp.sendRedirect(req.getContextPath() + page);
        }

    }
}
