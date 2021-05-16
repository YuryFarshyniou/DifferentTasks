package examples.by.yurachel.blinov.web.small_ex.inf_about_web_res.main;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* Для получения более полной информации о ресурсе требуется применять класс
URLConnection.
* */

public class Main {
    public static void main(String[] args) {
        String urlName = "https://www.google.com/";
        int timeout = 10_000_000;
        URL url;
        try {
            url = new URL(urlName);
            final URLConnection connection = url.openConnection(); // Получение экземпляра класса.
            //Установка таймаута на соединени.
            connection.setConnectTimeout(timeout); // Т.к. при вызове метода openConnection возможна серьезная блокировка основноо потока,следует установить таймаут на соединение.
            System.out.println(urlName + " content type:  "
                    + connection.getContentType());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
