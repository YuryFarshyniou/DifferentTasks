package examples.by.yurachel.blinov.patterns.behavioral_patterns.observer.example_2;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");
        Observer subscriber1 = new Subscriber("Marsy");
        Observer subscriber2 = new Subscriber("Yurachel");

        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);

        jobSite.addVacancy("Third JAva position.");
        jobSite.removeVacancy("First Java position");
    }
}
