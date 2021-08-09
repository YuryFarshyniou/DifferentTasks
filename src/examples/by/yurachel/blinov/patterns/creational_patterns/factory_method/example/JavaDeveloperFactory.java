package examples.by.yurachel.blinov.patterns.creational_patterns.factory_method.example;

public class JavaDeveloperFactory  implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
