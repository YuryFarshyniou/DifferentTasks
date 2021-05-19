package examples.by.yurachel.blinov.sessions_events_filters.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CookieController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CookieAction.setCookie(resp); // Добавление cookie
        // Извлечение cookie и добавление к request
        req.setAttribute("message", CookieAction.addToRequest(req));
        req.getRequestDispatcher("/jsp/maincookie.jsp").forward(req, resp);
    }
}

