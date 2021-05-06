package examples.by.yurachel.web.ex_blinov.udp_protocol.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPRecipient {
    public static void main(String[] args) {
        File file = new File("UDPtoxic.mp3");
        System.out.println("Recipient data...");
        // Прием файла.
        acceptFile(file, 8033, 1024);
    }

    private static void acceptFile(File file, int port, int pacSize) {
        byte[] data = new byte[pacSize];
        DatagramPacket pac = new DatagramPacket(data, data.length);
        try (FileOutputStream os = new FileOutputStream(file)) {
            DatagramSocket s = new DatagramSocket(port);
            /* Установка времени ожидания: если в течении 60 секунд не принято
            ни одного пакета, прием данных заканчивается.
            * */
            s.setSoTimeout(60_000);
            while (true) {
                s.receive(pac); // Получение пакета.
                os.write(data);
                os.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
