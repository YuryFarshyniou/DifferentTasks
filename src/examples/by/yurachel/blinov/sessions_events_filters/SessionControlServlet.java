package examples.by.yurachel.blinov.sessions_events_filters;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/sessionServlet")
public class SessionControlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        getSession дает доступ с помощью запроса к экземпляру сессии HttpSession,
        * соответствующему данному пользователю.Если параметр метода равен true,
        * то сервлет проверяет панличие активного сеанса,установленного с данным клиентом.
        * В случае успеха возвращает дескриптор этого сеанса.В противном случае создает новый сеанс,
        после чего начинается сбор информации о клиенте.*/

        HttpSession session = req.getSession(true);
        if (session.getAttribute("role") == null) { // Прочесть переменную с именем
            session.setAttribute("role", "moderator"); // Сохранить значение переменной в текущем сеансе.
        }
        /*Количество запросов,которые были сделаны к данному сервлету текущим пользователем
        в рамках текущей пользовательской сессии.
        * */
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            session.setAttribute("counter", 1);
        } else {
            //Увеличивает счетчик обращений к текущему сервлету и кладет его в сессию.
            counter++;
            session.setAttribute("counter", counter);
        }
        req.setAttribute("lifecycle", "CONTROL request LIFECYCLE");
        req.getRequestDispatcher("/jsp/sessionAttr.jsp").forward(req, resp);
    }
}
