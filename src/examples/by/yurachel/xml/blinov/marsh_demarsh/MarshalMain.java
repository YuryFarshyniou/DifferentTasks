package examples.by.yurachel.xml.blinov.marsh_demarsh;

import examples.by.yurachel.xml.blinov.marsh_demarsh.entity.Address;
import examples.by.yurachel.xml.blinov.marsh_demarsh.entity.Student;
import examples.by.yurachel.xml.blinov.marsh_demarsh.entity.Students;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MarshalMain {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Students.class);
            Marshaller m = context.createMarshaller();
            Students st = new Students() {
                {
                    //Добавление первого студента.
                    Address address = new Address("BLR", "Mogilev", "Shmidta");
                    Student s = new Student("yurachel", "Yura", "mmf", 3456434, address);
                    this.add(s);
                    //Добавление второго студента.
                    Address address2 = new Address("BLR", "Minck", "Shmidta");
                    Student s2 = new Student("semen", "Kolia", "mmf", 6785467, address2);
                    this.add(s2);
                }
            };
            m.marshal(st, new FileOutputStream("stud_marsh.xml"));
            m.marshal(st, System.out);//опия на консоль.
            System.out.println("XML was created.");
        } catch (FileNotFoundException e) {
            System.out.println("Xml can't create. " + e);
        } catch (JAXBException e) {
            System.out.println("JAXb error " + e);
        }
    }
}
