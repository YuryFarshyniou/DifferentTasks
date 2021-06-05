package examples.by.yurachel.blinov.patterns.structural.facade.example_2;

public class WorkFacade {
    private Developer developer = new Developer();
    private Job job = new Job();
    private BugTracker tracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        tracker.startSprint();
        developer.doJobBeforeDeadLine(tracker);
    }
}
