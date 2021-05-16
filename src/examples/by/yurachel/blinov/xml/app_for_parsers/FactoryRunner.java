package examples.by.yurachel.blinov.xml.app_for_parsers;

import examples.by.yurachel.blinov.xml.app_for_parsers.factory.AbstractStudentBuilder;
import examples.by.yurachel.blinov.xml.app_for_parsers.factory.StudentBuilderFactory;

public class FactoryRunner {
    public static void main(String[] args) {
        StudentBuilderFactory factory = new StudentBuilderFactory();
        AbstractStudentBuilder builder = factory.createStudentBuilder("dom");
        builder.buildSetStudents("some link");
        System.out.println(builder.getStudents());
    }
}
