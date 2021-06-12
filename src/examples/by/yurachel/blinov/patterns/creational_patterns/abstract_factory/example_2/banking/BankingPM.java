package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.banking;

import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking project manager manages banking project.");
    }
}
