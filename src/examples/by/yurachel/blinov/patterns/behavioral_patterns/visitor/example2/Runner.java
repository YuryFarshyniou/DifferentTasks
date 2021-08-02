package examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example2;

public class Runner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();
        System.out.println("Junior in action....");
        project.beWritten(junior);

        System.out.println("==================================");

        System.out.println("senior in action...");
        project.beWritten(senior);

    }
}
