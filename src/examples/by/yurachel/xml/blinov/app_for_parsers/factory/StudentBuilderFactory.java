package examples.by.yurachel.xml.blinov.app_for_parsers.factory;

import examples.by.yurachel.xml.blinov.app_for_parsers.factory.impl.StudentsDOMBuilder;
import examples.by.yurachel.xml.blinov.app_for_parsers.factory.impl.StudentsSAXBuilder;
import examples.by.yurachel.xml.blinov.app_for_parsers.factory.impl.StudentsStAXBuilder;

import java.util.Locale;

/*  Pattern Factory method предназначен для создания объектов,находящися в иерархической
зависимости.
* */

public class StudentBuilderFactory {
    private enum TypeParser {
        SAX, STAX, DOM
    }

    public AbstractStudentBuilder createStudentBuilder(String typeParser) {
        TypeParser type = TypeParser.valueOf(typeParser.toUpperCase(Locale.ROOT));
        switch (type) {
            case DOM:
                return new StudentsDOMBuilder();
            case SAX:
                return new StudentsSAXBuilder();
            case STAX:
                return new StudentsStAXBuilder();
            default:
                throw new EnumConstantNotPresentException(
                        type.getDeclaringClass(), type.name());
        }
    }
}
