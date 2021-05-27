package examples.by.yurachel.blinov.patterns.creational_patterns.prototype.example;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Issue> issueList = new ArrayList<Issue>() {
            {
                this.add(new Book(615, "Some", "Soe", 202));
                this.add(new Book(618, "Someasd", "Soe", 202));
                this.add(new Book(61123, "Someasd", "Soe", 202));
                this.add(new Book(61124, "Sasdome", "Soe", 202));
            }
        };
        IssueCacheClient cache = new IssueCacheClient(issueList);
        Issue copy = cache.cloneElementById(615);
        System.out.println(issueList);
        System.out.println(copy);
    }
}
