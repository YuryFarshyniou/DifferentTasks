package examples.by.yurachel.blinov.patterns.behavioral_patterns.iterator.example;

public class Runner {
    public static void main(String[] args) {
        StudentSession session = new StudentSession();
        session.addExams("MA", 9);
        session.addExams("THCV", 10);
        session.addExams("DS", 8);
        System.out.println("The list of exams: ");
        CustomIterator iterator = session.iterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
