package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.banking;

import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code..");
    }
}
