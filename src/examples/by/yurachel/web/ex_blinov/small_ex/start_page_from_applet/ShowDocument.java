package examples.by.yurachel.web.ex_blinov.small_ex.start_page_from_applet;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ShowDocument extends JApplet {
    private URL bsu = null; // Используется для доступа к ресурсам в интернете.

    public String getBaseURL() {
        return "https://bsu.by/";
    }

    public void paint(Graphics graphics) {
        int timer = 0;
        graphics.drawString("Load page", 10, 10);

        try {
            for (; timer < 30; timer++) {
                graphics.drawString(".", 10 + timer * 5, 25);
                Thread.sleep(100);
            }
            bsu = new URL(getBaseURL());
            this.getAppletContext().showDocument(bsu, "_blank");
        } catch (InterruptedException | MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
