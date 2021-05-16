package examples.by.yurachel.blinov.xml.sax_parser.second_sax_ex;

import examples.by.yurachel.blinov.xml.marsh_demarsh.entity.Student;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.Set;

public class StudentsSAXBuilder {
    private Set<Student> students;
    private StudentHandler sh;
    private XMLReader reader;

    public StudentsSAXBuilder() {
        //Создание SAX-анализатора.
        sh = new StudentHandler();
        try {
            //Создание объекта-обработчика.
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(sh);
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void buildSetStudents(String fileName) {
        try {
            //Разбор XML документа.
            reader.parse(fileName);

        } catch (SAXException | IOException exception) {
            exception.printStackTrace();
        }
        students = sh.getStudents();
    }
}
