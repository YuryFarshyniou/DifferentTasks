package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.website;

import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.Developer;
import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.ProjectManager;
import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.ProjectTeamFactory;
import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getManager() {
        return new  WebsitePM();
    }
}
