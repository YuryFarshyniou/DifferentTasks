package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getManager();
}
