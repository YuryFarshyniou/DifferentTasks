package examples.by.yurachel.blinov.patterns.structural_patterns.flyweight.example_2;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String specialty) {
        Developer developer = developers.get(specialty);
        if (developer == null) {
            switch (specialty) {
                case "java":
                    System.out.println("hiring java developer");
                    developer = new JavaDeveloper();
                    break;
                case "cpp":
                    System.out.println("Hiring cpp developer");
                    developer = new CppDeveloper();

            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
