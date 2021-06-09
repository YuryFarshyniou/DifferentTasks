package examples.by.yurachel.blinov.patterns.structural_patterns.flyweight.example_2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        DeveloperFactory factroy = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();
        developers.add(factroy.getDeveloperBySpeciality("java"));
        developers.add(factroy.getDeveloperBySpeciality("java"));
        developers.add(factroy.getDeveloperBySpeciality("java"));
        developers.add(factroy.getDeveloperBySpeciality("java"));
        developers.add(factroy.getDeveloperBySpeciality("java"));
        developers.add(factroy.getDeveloperBySpeciality("java"));
        developers.add(factroy.getDeveloperBySpeciality("java"));
        developers.add(factroy.getDeveloperBySpeciality("java"));
        developers.add(factroy.getDeveloperBySpeciality("java"));
        developers.add(factroy.getDeveloperBySpeciality("java"));
        developers.add(factroy.getDeveloperBySpeciality("java"));
        developers.add(factroy.getDeveloperBySpeciality("cpp"));
        developers.add(factroy.getDeveloperBySpeciality("cpp"));
        developers.add(factroy.getDeveloperBySpeciality("cpp"));
        developers.add(factroy.getDeveloperBySpeciality("cpp"));
        developers.add(factroy.getDeveloperBySpeciality("cpp"));
        developers.add(factroy.getDeveloperBySpeciality("cpp"));
        developers.add(factroy.getDeveloperBySpeciality("cpp"));
        developers.add(factroy.getDeveloperBySpeciality("cpp"));
        developers.add(factroy.getDeveloperBySpeciality("cpp"));

//        developers.forEach(Developer::writeCode);
        developers.forEach(System.out::println);
    }
}
