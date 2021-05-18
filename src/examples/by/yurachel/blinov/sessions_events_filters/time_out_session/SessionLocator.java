package examples.by.yurachel.blinov.sessions_events_filters.time_out_session;

import jakarta.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SessionLocator {
    private final static String BR = "<br/><hr/>";
    public static boolean flag = true;

    public static List<String> addMessage(HttpSession session) {
        List<String> messages = new ArrayList<>();
        if (session != null) { //Если сесси существует.
            messages.add("Creation time: " + new Date(session.getCreationTime()) + BR);
            messages.add("Session id: " + session.getId() + BR);
            messages.add("Session alive! " + BR);
        } else {// Если сессии не существует.
            messages.add("Session disabled!" + BR);
        }
        return messages;
    }
}
