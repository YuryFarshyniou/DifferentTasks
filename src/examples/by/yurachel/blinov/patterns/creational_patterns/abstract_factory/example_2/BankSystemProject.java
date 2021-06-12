package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2;

import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.banking.BankingTeamFactory;

public class BankSystemProject {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new BankingTeamFactory();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        ProjectManager manager = factory.getManager();
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
