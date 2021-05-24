package examples.by.yurachel.blinov.patterns.expert;

/*Класс Test ответственен за общие характеристики теста.*/
public class Test {
    private int testId;
    private String testName;
    private int questNumber;
    private long time;

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getQuestNumber() {
        return questNumber;
    }

    public void setQuestNumber(int questNumber) {
        this.questNumber = questNumber;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Test(int testId, String testName, int questNumber, long time) {
        this.testId = testId;
        this.testName = testName;
        this.questNumber = questNumber;
        this.time = time;
    }
}
