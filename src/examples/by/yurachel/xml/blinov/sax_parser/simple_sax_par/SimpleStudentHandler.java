package examples.by.yurachel.xml.blinov.sax_parser.simple_sax_par;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/*  Создать класс,который реализует один или несколько интерфейсов(ContentHandler,ErrorHandler,EntityHandler and others).
Или наследовать класс DefaultHandler и реализовать методы,отвечающие за обработку интересующих частей документа и ошибок.
*
* */

public class SimpleStudentHandler extends DefaultHandler {


    @Override
    public void startDocument() {
        System.out.println("Parsing started");
    }

    /*  uri - уникальное название namespace.
     * localName - имя элемента без префикса,задаваемого именем атрибута xmlns: xmlns:ns=http://www.example.com/Students,то есть без ns.
     * attributes - список атрибутов.
     * qName - полное имя элемента с префексом.
     * */

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        StringBuilder s = new StringBuilder(localName);
        //Получение и вывод информации об атрибутах элемента.
        for (int i = 0; i < attributes.getLength(); i++) {
            s.append(" ").append(attributes.getLocalName(i)).append("=").append(attributes.getValue(i));
        }
        System.out.println(s.toString().trim());
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        System.out.println(new String(ch, start, length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        System.out.println(localName);
    }

    @Override
    public void endDocument() {
        System.out.println("Parsing ended.");
    }


}
