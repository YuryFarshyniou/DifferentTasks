package examples.by.yurachel.blinov.patterns.behavioral_patterns.mediator.example2;

public class Runner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "User2");
        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        user1.sendMessage("Hello, ia m user 1");
        admin.sendMessage("I am admin.");

    }
}
