package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2;

import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.website.WebsiteTeamFactory;

public class WebsiteProject {
    public static void main(String[] args) {
        WebsiteTeamFactory factory = new WebsiteTeamFactory();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        ProjectManager manager = factory.getManager();
    }
}
