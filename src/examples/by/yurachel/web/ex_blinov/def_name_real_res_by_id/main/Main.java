package examples.by.yurachel.web.ex_blinov.def_name_real_res_by_id.main;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        // задание ip адреса в виде массива.
        byte[] ip = {(byte) 217,(byte) 21,(byte)43,(byte)10};
        try{
            InetAddress addr = InetAddress.getByAddress("University",ip);
            System.out.println(addr.getHostName() + " connection: " + addr.isReachable(10000));

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
