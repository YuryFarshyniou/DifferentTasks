package examples.by.yurachel.xml.blinov.stax_parser;

import com.sun.org.apache.xerces.internal.xni.parser.XMLConfigurationException;
import examples.by.yurachel.xml.blinov.marsh_demarsh.entity.Address;
import examples.by.yurachel.xml.blinov.marsh_demarsh.entity.Student;
import examples.by.yurachel.xml.blinov.sax_parser.second_sax_ex.StudentEnum;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class StudentsStAXBuilder {
    private HashSet<Student> students = new HashSet<>();
    private XMLInputFactory inputFactory;

    public StudentsStAXBuilder() {
        inputFactory = XMLInputFactory.newInstance();
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void buildSetStudents(String fileName) {
        FileInputStream fis = null;
        XMLStreamReader reader;
        String name;
        try {
            fis = new FileInputStream(fileName);
            reader = inputFactory.createXMLStreamReader(fis);
            //StAX parsing
            while (reader.hasNext()) {
                int type = reader.next();
                if (type == XMLStreamConstants.START_ELEMENT) {
                    name = reader.getLocalName();
                    if (StudentEnum.valueOf(name.toUpperCase(Locale.ROOT)) == StudentEnum.STUDENT) {
                        Student st = buildStudent(reader);
                        students.add(st);
                    }
                }
            }
        } catch (XMLStreamException | FileNotFoundException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private Student buildStudent(XMLStreamReader reader) throws XMLStreamException {
        Student st = new Student();
        st.setLogin(reader.getAttributeValue(null, StudentEnum.LOGIN.getValue()));
        st.setFaculty(reader.getAttributeValue(null, StudentEnum.FACULTY.getValue()));
        String name;
        while (reader.hasNext()) {
            int type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    name = reader.getLocalName();
                    System.out.println("Name in buildStudent: " + name);
                    switch (StudentEnum.valueOf(name.toUpperCase(Locale.ROOT))) {
                        case NAME:
                            st.setName(getXMLText(reader));
                            break;
                        case TELEPHONE:
                            String name2 = getXMLText(reader);
                            st.setTelephone(Integer.parseInt(name2));
                            break;
                        case ADDRESS:
                            st.setAddress(getXMLAddress(reader));
                            break;
                    }
                    break;

                case XMLStreamConstants.END_ELEMENT:
                    name = reader.getLocalName();
                    if (StudentEnum.valueOf(name.toUpperCase(Locale.ROOT)) == StudentEnum.STUDENT) {
                        return st;
                    }
                    break;
            }
        }
        throw new XMLStreamException("Unknown element in tag Student");
    }

    private Address getXMLAddress(XMLStreamReader reader) throws XMLStreamException {
        Address address = new Address();
        int type;
        String name;
        while (reader.hasNext()) {
            type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    name = reader.getLocalName();
                    switch (StudentEnum.valueOf(name.toUpperCase(Locale.ROOT))) {
                        case COUNTRY:
                            System.out.println("country");
                            address.setCountry(name.toUpperCase(Locale.ROOT));
                            break;
                        case CITY:
                            address.setCity(name.toUpperCase(Locale.ROOT));
                            break;
                        case STREET:
                            address.setStreet(name.toUpperCase(Locale.ROOT));
                            break;
                    }
                case XMLStreamConstants.END_ELEMENT:
                    name = reader.getLocalName();
                    if (StudentEnum.valueOf(name.toUpperCase()) == StudentEnum.ADDRESS) {
                        return address;
                    }
                    break;
            }
        }
        throw new XMLStreamException("Unknown element in tag Address");
    }

    private String getXMLText(XMLStreamReader reader) throws XMLStreamException {
        String text = null;
        if (reader.hasNext()) {
            reader.next();
            text = reader.getText();
        }
        return text;
    }
}
