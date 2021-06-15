package examples.by.yurachel.blinov.patterns.creational_patterns.prototype.example_2;

public class Runner {
    public static void main(String[] args) {
        Project master = new Project(1, "Master", "SourceCode code ");
        System.out.println(master);
        ProjectFactory factory = new ProjectFactory(master);
        Project master2 = factory.cloneProject();
        System.out.println(master2);
    }
}
