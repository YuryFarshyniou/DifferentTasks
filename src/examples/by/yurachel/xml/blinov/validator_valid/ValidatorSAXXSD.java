package examples.by.yurachel.xml.blinov.validator_valid;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class ValidatorSAXXSD {
    public static void main(String[] args) {
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String fileName = "C:\\Java\\DifferentTasks\\src\\examples\\by\\yurachel\\xml\\blinov\\students.xml.xml";
        String schemaName = "C:\\Java\\DifferentTasks\\src\\examples\\by\\yurachel\\xml\\blinov\\xsdStsudents.xsd";
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaName);
        try {
            //Создание схемы.
            Schema schema = factory.newSchema(schemaLocation);
            //Создание валидатора на основе схемы.
            Validator validator = schema.newValidator();
            // Проверка документа.
            Source source = new StreamSource(fileName);
            validator.validate(source);
            System.out.println(fileName + " is valid");
        } catch (SAXException e) {
            System.err.println("validation " + fileName + " is not valid because " + e.getMessage());
        } catch (IOException e) {
            System.err.println(fileName + " is not valid because " + e.getMessage());
        }
    }
}
