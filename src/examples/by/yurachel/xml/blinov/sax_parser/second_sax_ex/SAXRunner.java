package examples.by.yurachel.xml.blinov.sax_parser.second_sax_ex;

public class SAXRunner {
    public static void main(String[] args) {
        StudentsSAXBuilder builder = new StudentsSAXBuilder();
        builder.buildSetStudents("src\\examples\\by\\yurachel\\xml\\blinov\\students.xml");
        System.out.println(builder.getStudents());
    }
}
