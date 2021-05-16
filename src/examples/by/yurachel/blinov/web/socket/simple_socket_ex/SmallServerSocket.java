package examples.by.yurachel.blinov.web.socket.simple_socket_ex;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SmallServerSocket {
    public static void main(String[] args) {
        Socket s = null;
        PrintStream ps = null;
        try {
            //Отправка строки клиенту.
            // Сервер ожидает сообщения клиента и должен быть заранее запущен с указанием определенного порта.
            ServerSocket socket = new ServerSocket(8030);
            s = socket.accept();// Ожидание соединения
            ps = new PrintStream(s.getOutputStream());
            // Помещение строки hello в буффер.
            ps.println("Hello!");
            // Отправка содержимого буфера клиенту.
            ps.flush();

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(ps!=null){
                ps.close();
            }
            if(s!=null){
                try{//Разрыв соединения.
                    s.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
