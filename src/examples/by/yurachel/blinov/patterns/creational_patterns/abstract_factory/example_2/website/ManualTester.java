package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.website;

import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("manual tester tests web site...");
    }
}
