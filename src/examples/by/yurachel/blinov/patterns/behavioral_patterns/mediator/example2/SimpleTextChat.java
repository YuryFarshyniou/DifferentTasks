package examples.by.yurachel.blinov.patterns.behavioral_patterns.mediator.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleTextChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        users.stream().filter(user1 -> user1 != user)
                .collect(Collectors.toList()).forEach(user1 -> user1.getMessage(message));
        admin.getMessage(message);
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }
}
