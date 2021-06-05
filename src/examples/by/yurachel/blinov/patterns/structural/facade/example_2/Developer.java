package examples.by.yurachel.blinov.patterns.structural.facade.example_2;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker tracker){
        if(tracker.isActiveSprint()){
            System.out.println("developer is solving problems..");
        }else{
            System.out.println("Developer is reading habr.");
        }
    }
}
