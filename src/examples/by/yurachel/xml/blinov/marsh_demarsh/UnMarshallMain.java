package examples.by.yurachel.xml.blinov.marsh_demarsh;

import examples.by.yurachel.xml.blinov.marsh_demarsh.entity.Student;
import examples.by.yurachel.xml.blinov.marsh_demarsh.entity.Students;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnMarshallMain {
    private static final String xmlPath = "src\\examples\\by\\yurachel\\xml\\blinov\\marsh_demarsh\\stud_marsh.xml";

    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(Student.class);
            Unmarshaller m = jc.createUnmarshaller();
            FileReader fr = new FileReader(xmlPath);
            Students students = (Students) m.unmarshal(fr);
            System.out.println(students);
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
