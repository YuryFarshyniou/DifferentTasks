package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.website;

import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example_2.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website pm manages web site project..");
    }
}
