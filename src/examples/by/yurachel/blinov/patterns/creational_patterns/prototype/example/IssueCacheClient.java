package examples.by.yurachel.blinov.patterns.creational_patterns.prototype.example;

import java.util.ArrayList;
import java.util.List;

public class IssueCacheClient implements Client<Issue> {
    private List<Issue> cache;

    public IssueCacheClient() {
        cache = new ArrayList<>();
    }

    public IssueCacheClient(List<Issue> cache) {
        this.cache = cache;
    }

    @Override
    public Issue cloneElementById(Integer Id) throws CloneNotSupportedException {
        for (Issue issue : cache) {
            if (issue.getId().equals(Id)) {
                return (Issue) issue.clone();
            }
        }
        throw new IllegalArgumentException("illegal ID " + Id);
    }

    @Override
    public List<Issue> cloneElements(Object... param) {
        List<Issue> list = new ArrayList<>();
        // realization of searching cloning b organization of new collection.
        return list;
    }
}
