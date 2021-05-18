package examples.by.yurachel.blinov.sessions_events_filters.time_out_session;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/*Реализует процесс ликвидации сессии при отсутствии активности за определенный промежуток времени.
* */

public class TimeoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = null;
        if (SessionLocator.flag) {
            //Создание сесси и установка времени инвалидации.
            session = req.getSession();
            int timeLive = 10; // десят секунд.
            session.setMaxInactiveInterval(timeLive);
            SessionLocator.flag = false;
        } else {
            //Если сессия не существует,то ссылка на нее не будет получена.
            session = req.getSession(false);
            if (session == null) {
                SessionLocator.flag = true;
            }
        }
        req.setAttribute("messages",SessionLocator.addMessage(session));
        req.getRequestDispatcher("/jsp/time.jsp").forward(req,resp);

    }
}
