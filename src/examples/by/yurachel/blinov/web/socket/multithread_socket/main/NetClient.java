package examples.by.yurachel.blinov.web.socket.multithread_socket.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class NetClient {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader reader = null;
        try{
            // Установка соединения с сервером.
            socket = new Socket(InetAddress.getLocalHost(),8071);
            // или Socket socket = new Socket("server_name",8071");
            PrintStream ps = new PrintStream(socket.getOutputStream());
            reader = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()
            ));
            for (int i = 0; i <= 10; i++) {
                ps.println("Ping");
                System.out.println(reader.readLine());
                Thread.sleep(1000);

            }
        }catch(IOException | InterruptedException e){
            e.printStackTrace();
        }finally{
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
