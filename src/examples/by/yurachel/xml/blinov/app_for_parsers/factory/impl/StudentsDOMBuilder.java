package examples.by.yurachel.xml.blinov.app_for_parsers.factory.impl;

import examples.by.yurachel.xml.blinov.app_for_parsers.factory.AbstractStudentBuilder;
import examples.by.yurachel.xml.blinov.marsh_demarsh.entity.Student;

import javax.xml.parsers.DocumentBuilder;
import java.util.Set;

public class StudentsDOMBuilder extends AbstractStudentBuilder {

    private DocumentBuilder docBuilder;

    public StudentsDOMBuilder() {
        //more code.
    }

    public StudentsDOMBuilder(Set<Student> students) {
        super(students);
        //more code.
    }

    @Override
    public void buildSetStudents(String fileName) {
        //more code.
    }
}
