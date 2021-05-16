package examples.by.yurachel.blinov.web.small_ex.read_doc_fr_int.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/* Читается содержимое HTML файла по указанному адресу и выводится в окно консоли.
* */
public class ReadDocument {
    public static void main(String[] args) {
        URL google = null;
        String urlName = "https://www.google.com/";
        try {
            google = new URL(urlName);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (google == null) {
            throw new RuntimeException();
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
