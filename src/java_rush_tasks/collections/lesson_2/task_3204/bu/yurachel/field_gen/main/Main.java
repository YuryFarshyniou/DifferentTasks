package java_rush_tasks.collections.lesson_2.task_3204.bu.yurachel.field_gen.main;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password);
    }

    public static ByteArrayOutputStream getPassword() {
        String password = "";
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        for (int i = 0; i < 6; i++) {
            password += randomCharacter("abcdefghijklmnopqrstuvwxyz");
        }
        String randomDigit = randomCharacter("0123456789");
        password = insertAtRandom(password, randomDigit);
        String randomCharacterInUpCase = randomCharacter("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        password = insertAtRandom(password, randomCharacterInUpCase);
        try {
            bos.write(password.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bos;
    }

    private static String randomCharacter(String characters) {
        int n = characters.length();
        int r = (int) (n * Math.random());
        return characters.substring(r, r + 1);
    }

    public static String insertAtRandom(String str, String toInsert) {
        int n = str.length();
        int r = (int) ((n + 1) * Math.random());
        return str.substring(0, r) + toInsert + str.substring(r);
    }
}
