package examples.by.yurachel.web_app.mail_app;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Properties;

@WebServlet("/MailServlet")
public class MailServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Запрос параметров почтового сервера из mail.properties.
        Properties properties = new Properties();
        ServletContext context = getServletContext();
        String fileName = context.getInitParameter("mail");
        //Загрузка параметров почтового сервера в объект свойств.
        properties.load(context.getResourceAsStream(fileName));
        MailThread mailOperator = new MailThread(req.getParameter("to"),
                req.getParameter("subject"),
                req.getParameter("body"),
                properties);
        //Запуск процесса отправки письма в отедльном потоке.
        mailOperator.start();
        //Переход на страницу с предложением о создании нового письма.
        req.getRequestDispatcher("/send.jsp").forward(req, resp);
    }
}
