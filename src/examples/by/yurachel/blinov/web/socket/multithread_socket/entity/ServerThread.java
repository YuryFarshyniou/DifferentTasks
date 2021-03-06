package examples.by.yurachel.blinov.web.socket.multithread_socket.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class ServerThread extends Thread {
    private PrintStream os; // Передача.
    private BufferedReader is; // Прием.
    private InetAddress addr; // Адрес клиента.

    public ServerThread(Socket socket) throws IOException {
        os = new PrintStream(socket.getOutputStream());
        is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        addr = socket.getInetAddress();
    }

    @Override
    public void run() {
        int i = 0;
        String str;
        try {
            while ((str = is.readLine()) != null) {
                if ("PING".equals(str)) {
                    os.println("PONG" + ++i);
                }
                System.out.println("PING-PONG " + i + " with " +
                        addr.getHostName());
            }
        } catch (IOException e) {
            // Если клиент не отвечает ,соединение с ним разрывается.
            System.err.println("Disconnect");
        } finally {
            disconnect();
        }
    }

    private void disconnect() {
        try {
            if (os != null) {
                os.close();
            }
            if (is != null) {
                is.close();
            }
            System.out.println(addr.getHostName() + " disconnecting");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            this.interrupt();
        }
    }

}
