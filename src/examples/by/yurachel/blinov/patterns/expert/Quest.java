package examples.by.yurachel.blinov.patterns.expert;

public class Quest {
    private int questId;
    private int testId;

    public Quest(int questId, int testId) {
        this.questId = questId;
        this.testId = testId;
    }

    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }
}
