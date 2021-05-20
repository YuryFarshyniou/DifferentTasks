package examples.by.yurachel.blinov.sessions_events_filters.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = {"/controller"}, servletNames = {"MainServlet"})
public class ServletSecurityFilter implements Filter {

    /*Фильтр также успешно перехватывает обращения к сервлету. Например, об-
ращение к сервлету из любого источника перехватывается следующим фильтром.
Фильтр проверяет тип пользователя, извлекая его значение из сессии.
Если тип не задан, то фильтр присваивает ему значение GUEST и перенаправ-
ляет клиента на страницу guest.jsp.*/

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();

        ClientType type = (ClientType) session.getAttribute("userType");
        if (type == null) {
            type = ClientType.GUEST;
            session.setAttribute("userType", type);
            RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/jsp/huest.jsp");
            dispatcher.forward(req, resp);
            return;
        }
        // pass the request along the filter chain
        chain.doFilter(request, response);
    }
}
