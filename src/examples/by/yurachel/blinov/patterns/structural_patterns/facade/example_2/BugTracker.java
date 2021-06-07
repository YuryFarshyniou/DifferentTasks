package examples.by.yurachel.blinov.patterns.structural_patterns.facade.example_2;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active.");
        activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is not active.");
        activeSprint = false;
    }
}
