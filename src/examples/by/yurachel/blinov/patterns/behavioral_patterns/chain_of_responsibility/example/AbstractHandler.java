package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.example;

public abstract class AbstractHandler {
    protected MapEmployee db;
    protected AbstractHandler successor = DefaultHandlerRequest.getHandlerRequest();

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
        private static DefaultHandlerRequest handler = new DefaultHandlerRequest();

        private DefaultHandlerRequest() {
        }

        public static DefaultHandlerRequest getHandlerRequest() {
            return handler;
        }

        @Override
        public void handleRequest(Employee employee) {
            // Default handler, if its exists.
        }

        @Override
        public void chain(Employee user) {
            // always empty
        }
    }
}
