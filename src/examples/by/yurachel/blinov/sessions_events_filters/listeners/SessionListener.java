package examples.by.yurachel.blinov.sessions_events_filters.listeners;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
    public void attributeRemoved(HttpSessionBindingEvent event) {

    }

    public void attributeAdded(HttpSessionBindingEvent ev) {
        //Запись в LOG-файл или иные действия.
        System.out.println("add: " + ev.getClass().getSimpleName() + " : " +
                ev.getName() + " : " + ev.getValue());
    }

    public void attributeReplaced(HttpSessionBindingEvent ev) {
        //Запись в LOG-файл или иные действия.
        System.out.println("replace: " + ev.getClass().getSimpleName() + " : " +
                ev.getName() + " : " + ev.getValue());
    }
}
