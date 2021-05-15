package examples.by.yurachel.web_app.servlet_synchronization;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

@WebServlet("/ServletSynchronization")
public class ServletSynchronization extends HttpServlet {
    //синхронизируемый объект.
    private final StringBuilder locked = new StringBuilder();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer out = resp.getWriter();
        out.write(makeString());
        out.flush();
    }

    private String makeString() {
        //оригинал строки.
        final String SYNCHRO = "SYNCHRONIZATION";
        synchronized (locked) {
            try {
                for (int i = 0; i < SYNCHRO.length(); i++) {
                    locked.append(SYNCHRO.charAt(i));
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String result = locked.toString();
            locked.delete(0, SYNCHRO.length());
            return result;
        } // ending synchronized block.

    }
}
