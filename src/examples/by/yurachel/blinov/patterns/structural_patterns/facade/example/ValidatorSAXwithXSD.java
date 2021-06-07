package examples.by.yurachel.blinov.patterns.structural_patterns.facade.example;

import examples.by.yurachel.blinov.xml.validatorXSD.StudentErrorHandler;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

/*Например, в главе «XML & Java» в примере даны примеры кода для валида-
ции XML-документа. Одну из вариаций можно записать в виде:*/
public class ValidatorSAXwithXSD {
    public static void main(String[] args) {
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String filename = "some file";
        String schemaName = "some schema";
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaName);
        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(filename);
            StudentErrorHandler sh = new StudentErrorHandler();
            validator.setErrorHandler(sh);
            validator.validate(source);
            System.out.println(filename + " validating is ended correctly.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
