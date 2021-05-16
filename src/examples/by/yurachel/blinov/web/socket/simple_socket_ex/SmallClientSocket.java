package examples.by.yurachel.blinov.web.socket.simple_socket_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SmallClientSocket {
    public static void main(String[] args) {
        // Получение строки клиентом.
        try (Socket socket = new Socket("DESKTOP-7FDCUJG", 8030);// Сокетное соединение с сервером создается клиентом.
             // server_name компьютер,на котором стоит сервер-сокет.
             BufferedReader reader = new BufferedReader(new InputStreamReader(
                     socket.getInputStream()
             ))) {
            String message = reader.readLine();
            System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/* Аналогично клиент может послать серверу через поток вывода,полученный с помощью методы getOutputStream(),
а серве может получать данные чере поток ввода,полученный с помощью методы getInputStream.
*
* */
