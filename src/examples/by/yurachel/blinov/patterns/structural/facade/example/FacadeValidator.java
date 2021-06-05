package examples.by.yurachel.blinov.patterns.structural.facade.example;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

/*Код класса ValidatorSAXWithXSD выполняет некоторую последовательность обязательных дейст-
вий, определенных разработчиком библиотеки. Чтобы решением можно было
воспользоваться повторно, следует сделать фасад для него и фактически
скрыть детали реализации за фасадом метода, а именно:*/
public class FacadeValidator {
    public boolean validateSAXWithXSD(String xmlFileName,
                                      String schemaFileName, DefaultHandler handler) {
        boolean result = false;
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaFileName);
        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(xmlFileName);
            validator.setErrorHandler(handler);
            validator.validate(source);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
/*Имена файлов и экземпляр класса-обработчика ошибок передаются в метод
в качестве параметров. Метод же содержит стандартную последовательность
действий, вмешиваться в которую нет разумных оснований.*/
