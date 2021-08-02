package examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example2;

public class ProjectClass implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
developer.create(this);
    }
}
