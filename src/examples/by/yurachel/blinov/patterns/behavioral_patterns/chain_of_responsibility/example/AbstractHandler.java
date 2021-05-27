package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.example;

public abstract class AbstractHandler {
    protected MapEmployee db;
    protected AbstractHandler successor = DefaultHandleRequest.getHandleRequest();

    public AbstractHandler(AbstractHandler successor) {
        this.db = new MapEmployee();
        this.successor = successor;
    }

    public AbstractHandler() {
        this.db = new MapEmployee();
    }

    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }

    abstract public void handleRequest(Employee employee);

    public void chain(Employee user) {
        if (db.containsUser(user)) {
            handleRequest(user);
            successor.chain(user);
        } else {
            System.out.println("user don't exist");
        }
    }

    private static class DefaultHandlerRequest extends AbstractHandler {
        private static DefaultHandleRequest handler = new DefaultHandlerRequest();
    }
}
