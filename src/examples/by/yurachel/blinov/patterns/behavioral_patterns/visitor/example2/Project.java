package examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example2;

public class Project implements ProjectElement {
    ProjectElement[] elements;

    public Project() {
        this.elements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }


    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element : elements) {
            element.beWritten(developer);
        }
    }
}
