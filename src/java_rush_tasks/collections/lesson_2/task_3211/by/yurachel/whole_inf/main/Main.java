package java_rush_tasks.collections.lesson_2.task_3211.by.yurachel.whole_inf.main;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject("test string");
            oos.flush();
            System.out.println(compareMD5(bos, "5a47d12a2e3f9fecf2d9ba1fd98152eb")); //true
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static boolean compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(byteArrayOutputStream.toByteArray());
            byte[] textBytes = md.digest();
            for (byte b : textBytes) {
                sb.append(String.format("%02x", b));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString().equals(md5);
    }
}
