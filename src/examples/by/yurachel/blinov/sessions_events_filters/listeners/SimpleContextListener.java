package examples.by.yurachel.blinov.sessions_events_filters.listeners;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class SimpleContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        String mailFeedback = context.getInitParameter("feedback");
        context.log("Context Initialized with parameter: " +
                mailFeedback);
        System.out.println("Context Initialized with parameter:" +
                mailFeedback);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
