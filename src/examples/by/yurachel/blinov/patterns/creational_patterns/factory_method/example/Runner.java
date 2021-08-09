package examples.by.yurachel.blinov.patterns.creational_patterns.factory_method.example;

import java.util.Locale;

public class Runner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = getDeveloperFactoryBySpeciality("cpp");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory getDeveloperFactoryBySpeciality(String speciality) {
        DeveloperFactory developerFactory;
        DeveloperSpeciality speciality1 = DeveloperSpeciality.valueOf(speciality.toUpperCase(Locale.ROOT));
        switch (speciality1) {
            case JAVA:
                developerFactory = new JavaDeveloperFactory();
                break;
            case CPP:
                developerFactory = new CppDeveloperFactory();
                break;
            default:
                throw new IllegalArgumentException("Wrong speciality");
        }
        return developerFactory;
    }
}
