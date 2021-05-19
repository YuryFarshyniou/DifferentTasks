package examples.by.yurachel.blinov.sessions_events_filters.listeners;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpServletRequest;

@WebListener
public class SimpleRequestListener implements ServletRequestListener {
    public void requestInitialized(ServletRequestEvent ev) {
        //Будет использован для получения информации о запросе.
        HttpServletRequest req = (HttpServletRequest) ev.getServletRequest();
        String uri = "Request Initialized for " + req.getRequestURI();
        String id = "Request Initialized with ID=" + req.getRequestedSessionId();
        System.out.println(uri + "\n" + id);
        ServletContext context = ev.getServletContext();
        //Счетчик числа созданных запросов.

        Integer reqCount = (Integer) req.getSession().getAttribute("counter");
        if (reqCount == null) {
            reqCount = 0;
        }
        context.log(uri + "\n" + id + ", requestCounter=" + reqCount);
    }

    public void requestDestroyed(ServletRequestEvent event) {
        System.out.println("Request Destroyed: " + event.getServletRequest().getAttribute("lifecycle"));
    }
}
