package examples.by.yurachel.blinov.patterns.behavioral_patterns.memento.example2;

public class Runner {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo github = new GithubRepo();
        System.out.println("Creating new project . Version 1.0");

        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to github");

        github.setSave(project.save());
        System.out.println("Updating project  to Version 1.1");

        System.out.println("Writing poor code ");

        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong");

        System.out.println("Rolling back to Version 1.0");

        project.Load(github.getSave());

        System.out.println("PRoject after rollbac: " + project);
    }
}
