package examples.by.yurachel.blinov.xml.app_for_parsers.factory.impl;

import examples.by.yurachel.blinov.xml.app_for_parsers.factory.AbstractStudentBuilder;
import examples.by.yurachel.blinov.xml.marsh_demarsh.entity.Student;
import examples.by.yurachel.blinov.xml.sax_parser.second_sax_ex.StudentHandler;
import org.xml.sax.XMLReader;

import java.util.Set;

public class StudentsSAXBuilder extends AbstractStudentBuilder {
    private StudentHandler sh;
    private XMLReader reader;

    public StudentsSAXBuilder() {

      // more code;
    }

    @Override
    public void buildSetStudents(String fileName) {
        //more code.
    }



    public StudentsSAXBuilder(Set<Student> students) {
        super(students);
        //more code;
    }


}
