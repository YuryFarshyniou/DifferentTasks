package examples.by.yurachel.xml.blinov.dom_parser;

public class DOMRunner {
    public static void main(String[] args) {
        StudentDOMBuilder builder = new StudentDOMBuilder();

        builder.buildSetStudents("src\\examples\\by\\yurachel\\xml\\blinov\\students.xml");
        System.out.println(builder.getStudents());
    }
}
