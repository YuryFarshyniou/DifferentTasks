package examples.by.yurachel.blinov.xml.dom_parser;

import examples.by.yurachel.blinov.xml.marsh_demarsh.entity.Address;
import examples.by.yurachel.blinov.xml.marsh_demarsh.entity.Student;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StudentDOMBuilder {
    private Set<Student> students;
    private DocumentBuilder builder;

    public StudentDOMBuilder() {
        this.students = new HashSet<>();
        //Создание DOM анализатора.
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void buildSetStudents(String fileName) {
        Document doc = null;
        try {
            // парсинг XML документа и создание древовидной структуры.
            doc = builder.parse(fileName);
            Element root = doc.getDocumentElement();
            //получение списка дочерних элементов student.
            NodeList studentsList = root.getElementsByTagName("student");
            for (int i = 0; i < studentsList.getLength(); i++) {
                Element studentElement = (Element) studentsList.item(i);
                Student student = buildStudent(studentElement);
                students.add(student);
            }

        } catch (IOException | SAXException exception) {
            exception.printStackTrace();
        }
    }

    private Student buildStudent(Element studentElement) {
        Student student = new Student();
        //заполнение объекта student.
        student.setFaculty(studentElement.getAttribute("faculty")); // Проверка на null
        student.setName(getElementTextContent(studentElement, "name"));
        int tel = Integer.parseInt(getElementTextContent(studentElement, "telephone"));
        student.setTelephone(tel);
        Address address = student.getAddress();
        //Заполнение объекта address.
        Element addressElement = (Element) studentElement.getElementsByTagName("address").item(0);
        address.setCountry(getElementTextContent(studentElement, "country"));
        address.setCity(getElementTextContent(studentElement, "city"));
        address.setStreet(getElementTextContent(studentElement, "street"));
        student.setLogin(studentElement.getAttribute("login"));
        return student;
    }
    //Получение текстового содержиимого тега.

    private static String getElementTextContent(Element element, String elementName) {
        NodeList list = element.getElementsByTagName(elementName);
        Node node = list.item(0);
        return node.getTextContent();
    }
}
