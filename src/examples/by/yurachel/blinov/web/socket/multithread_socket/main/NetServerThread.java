package examples.by.yurachel.blinov.web.socket.multithread_socket.main;

import examples.by.yurachel.blinov.web.socket.multithread_socket.entity.ServerThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServerThread {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(8071);
            System.out.println("initialized");
            while(true){
                //Ожидание клиента.
                Socket socket = server.accept();
                System.out.println(socket.getInetAddress().getHostName()+ " connected.");
                /* Создание отдельного потока для обмена данными с соединившимся клиентом.
                * */
                ServerThread thread = new ServerThread(socket);
                thread.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
