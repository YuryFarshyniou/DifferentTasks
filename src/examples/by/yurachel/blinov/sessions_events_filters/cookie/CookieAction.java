package examples.by.yurachel.blinov.sessions_events_filters.cookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

public class CookieAction {
    private static int number = 1;

    public static void setCookie(HttpServletResponse response) {
        String name = "Yurachel";
        String role = "admin";
        Cookie c = new Cookie(name, role);
        c.setMaxAge(60 * 60);//Время жизни файла cookie.

        response.addCookie(c); //Добавление cookie к объекту ответу.
        String value = response.getLocale().toString();
        Cookie loc = new Cookie("locale", value);
        response.addCookie(loc);
    }

    public static List<String> addToRequest(HttpServletRequest req) {
        List<String> messages = new ArrayList<>();
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            messages.add("number cookies: " + cookies.length);
            for (int i = 0; i < cookies.length; i++) {
                Cookie c = cookies[i];
                messages.add(c.getName() + " = " + c.getValue());
            }
        }
        return messages;
    }
}
