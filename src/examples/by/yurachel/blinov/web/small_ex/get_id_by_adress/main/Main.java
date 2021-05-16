package examples.by.yurachel.blinov.web.small_ex.get_id_by_adress.main;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        InetAddress currentIP = null; // Используется для определения IP адреса.
        InetAddress otherIP = null;
        try {
            currentIP = InetAddress.getLocalHost();
            // Вывод IP дреса локального компьютера.
            System.out.println("My ip: " + currentIP);
            otherIP = InetAddress.getByName("www.google.com");
            System.out.println("Google: " + otherIP);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
