package examples.by.yurachel.web.ex_blinov.udp_protocol.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.*;

public class UDPSender {
    public static void main(String[] args) {
        String fileName = "audio/toxic.mp3";
        try(FileInputStream fr = new FileInputStream(new File(fileName))){
            byte[]data = new byte[1024];
            DatagramSocket dSocket = new DatagramSocket(); // Может выступать в роли клиента и сервера,т.е. он способен получать и отправлять пакеты.
            InetAddress address = InetAddress.getLocalHost();
            DatagramPacket packet; // Класс содержит в себе передаваемые данные,представленные в виде массива байт.
            while(fr.read(data)!=-1){
                //Создание пакета данных.
                packet = new DatagramPacket(data,data.length,address,8033); // Используется для отправки датаграмм.
                dSocket.send(packet); // Передача пакета.
            }
            System.out.println("Success");

        }catch (IOException e ){
            e.printStackTrace();
        }
    }
}
