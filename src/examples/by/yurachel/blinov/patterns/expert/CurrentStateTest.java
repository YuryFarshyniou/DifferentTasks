package examples.by.yurachel.blinov.patterns.expert;

import java.util.Queue;

/* Владеет информацией о текущем состоянии теста.
* */

public class CurrentStateTest {
    private int testId;
    private int studentId;
    private int currentQuestId;
    private long timeRemain;
    private Queue<Long> listQuestID;

    public CurrentStateTest(int testId, int studentId, int currentQuestId, long timeRemain, Queue<Long> listQuestID) {
        this.testId = testId;
        this.studentId = studentId;
        this.currentQuestId = currentQuestId;
        this.timeRemain = timeRemain;
        this.listQuestID = listQuestID;
    }
    //Methods
}
