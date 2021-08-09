package examples.by.yurachel.blinov.patterns.creational_patterns.factory_method.example;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
