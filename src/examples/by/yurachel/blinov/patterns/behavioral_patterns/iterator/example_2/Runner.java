package examples.by.yurachel.blinov.patterns.behavioral_patterns.iterator.example_2;

public class Runner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "MAven", "MySQL"};
        JavaDeveloper developer = new JavaDeveloper("Yurachel", skills);
        Iterator iterator = developer.getIterator();
        System.out.println("Developer " + developer.getName());
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" ");
        }
    }
}
