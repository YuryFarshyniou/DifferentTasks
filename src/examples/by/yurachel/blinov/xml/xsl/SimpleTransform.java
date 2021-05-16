package examples.by.yurachel.blinov.xml.xsl;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class SimpleTransform {
    public static void main(String[] args) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            //Установка используемого XSL-преобразования.
            Transformer transformer = factory.newTransformer(
                    new StreamSource("src\\examples\\by\\yurachel\\xml\\\\blinov\\xsl\\students.xsl"));
            //Установка исходного XML документа и конечного xml файла.

            transformer.transform(new StreamSource("src\\examples\\by\\yurachel\\xml\\blinov\\students.xml"),
                    new StreamResult("src\\examples\\by\\yurachel\\xml\\\\blinov\\xsl\\newStudents.xml"));
            System.out.println("Transform complete");

        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

}
