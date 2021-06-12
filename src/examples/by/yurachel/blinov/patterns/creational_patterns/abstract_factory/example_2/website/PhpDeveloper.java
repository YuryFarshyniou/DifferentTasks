package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.website;

import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
