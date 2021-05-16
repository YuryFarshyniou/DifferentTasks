package examples.by.yurachel.blinov.xml.app_for_parsers.factory.impl;

import examples.by.yurachel.blinov.xml.app_for_parsers.factory.AbstractStudentBuilder;
import examples.by.yurachel.blinov.xml.marsh_demarsh.entity.Student;

import javax.xml.stream.XMLInputFactory;
import java.util.Set;

public class StudentsStAXBuilder extends AbstractStudentBuilder {
    private XMLInputFactory inputFactory;

    public StudentsStAXBuilder() {
        //more code.
    }

    public StudentsStAXBuilder(Set<Student> students) {
        super(students);
        //more code.
    }

    @Override
    public void buildSetStudents(String fileName) {
        //more code.
    }
}
