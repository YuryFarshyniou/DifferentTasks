package examples.by.yurachel.xml.blinov.validatorXSD;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;

public class ValidatorSAX {
    public static void main(String[] args) {
        String fileName = "C:\\Java\\DifferentTasks\\src\\examples\\by\\yurachel\\xml\\blinov\\students.xml.xml";
        String schemaNAme = "C:\\Java\\DifferentTasks\\src\\examples\\by\\yurachel\\xml\\blinov\\xsdStsudents.xsd";
        String logName = "C:\\Java\\DifferentTasks\\src\\examples\\by\\yurachel\\xml\\blinov\\loger.txt";
        Schema schema = null;
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);
        try {
            //Установка проверки с использованием XSD.
            schema = factory.newSchema(new File(schemaNAme));
            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setSchema(schema);
            //Создание объекта парсера.
            SAXParser parser = spf.newSAXParser();
            //Установка обработчика ошибок и запуск.
            parser.parse(fileName,new StudentErrorHandler());
            System.out.println(fileName + " valid");
        } catch (ParserConfigurationException e) {
            System.err.println(fileName + " config error " + e.getMessage());
        } catch (SAXException e) {
            System.err.println(fileName + " SAX error " + e.getMessage());
        } catch (IOException e) {
            System.err.println(fileName + " IOException error " + e.getMessage());

        }
    }
}
