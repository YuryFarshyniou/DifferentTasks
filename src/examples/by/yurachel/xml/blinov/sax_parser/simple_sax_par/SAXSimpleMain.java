package examples.by.yurachel.xml.blinov.sax_parser.simple_sax_par;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

/* Создать XMLReader reader = new XMLReaderFactory.createXMLReader().

Передать в reader объект класса,созданного на шаге 1 с помощью соответствующих методов:setContentHandler,
setEntityResolver() and others.

Вызвать метод parse() которому в качестве параметра передать путь URI к анализируемому документу либо InputSource.
 *
 * */
public class SAXSimpleMain {
    public static void main(String[] args) {
        try {
            // Создание SAX анализатора.
            XMLReader reader = XMLReaderFactory.createXMLReader();
            SimpleStudentHandler studentHandler = new SimpleStudentHandler();
            reader.setContentHandler(studentHandler);
            reader.parse("src\\examples\\by\\yurachel\\xml\\blinov\\marsh_demarsh\\stud_marsh.xml");

        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
