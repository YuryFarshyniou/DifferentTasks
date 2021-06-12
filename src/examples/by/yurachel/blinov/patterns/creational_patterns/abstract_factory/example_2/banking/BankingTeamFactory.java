package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.banking;

import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.Developer;
import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.ProjectManager;
import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.ProjectTeamFactory;
import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getManager() {
        return new BankingPM();
    }
}
