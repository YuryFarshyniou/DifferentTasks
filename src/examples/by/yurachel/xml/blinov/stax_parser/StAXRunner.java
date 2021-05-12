package examples.by.yurachel.xml.blinov.stax_parser;

public class StAXRunner {
    public static void main(String[] args) {
        StudentsStAXBuilder builder = new StudentsStAXBuilder();
        builder.buildSetStudents("src\\examples\\by\\yurachel\\xml\\blinov\\students.xml");
        System.out.println(builder.getStudents());
    }
}
