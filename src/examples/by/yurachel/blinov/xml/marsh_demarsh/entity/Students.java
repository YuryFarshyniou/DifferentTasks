package examples.by.yurachel.blinov.xml.marsh_demarsh.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Students {
    @XmlElement(name = "student")
    private List<Student> list = new ArrayList<>();

    public Students() {
        super();
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public boolean add(Student s) {
        return list.add(s);
    }

    @Override
    public String toString() {
        return "Students{" +
                "list=" + list +
                '}';
    }
}
