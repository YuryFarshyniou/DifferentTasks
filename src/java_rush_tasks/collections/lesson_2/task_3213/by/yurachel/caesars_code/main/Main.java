package java_rush_tasks.collections.lesson_2.task_3213.by.yurachel.caesars_code.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args){
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key){
        StringBuilder sb = new StringBuilder("");
        if (reader == null) {
            return sb.toString();
        }
        try (BufferedReader br = new BufferedReader(reader)) {
            int i;
            while ((i = br.read()) != -1) {
                char k = (char) i;
                sb.append((char) (k + key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
