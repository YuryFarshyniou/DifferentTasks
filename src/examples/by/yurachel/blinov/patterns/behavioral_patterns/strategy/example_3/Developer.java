package examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.example_3;

import java.util.Objects;

public class Developer {
    int a;
    String name;
    Activity activity;

    public Developer() {
    }

    public Developer(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return a == developer.a && Objects.equals(name, developer.name) && Objects.equals(activity, developer.activity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, name, activity);
    }
}
