package examples.by.yurachel.blinov.xml.app_for_parsers.factory;

import examples.by.yurachel.blinov.xml.marsh_demarsh.entity.Student;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractStudentBuilder {

    //protected т.к. часто к нему обращаются из подкласса.
    protected Set<Student> students;

    public AbstractStudentBuilder() {
    }

    public AbstractStudentBuilder(Set<Student> students) {
        this.students = new HashSet<>();
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    abstract public void buildSetStudents(String fileName);
}
