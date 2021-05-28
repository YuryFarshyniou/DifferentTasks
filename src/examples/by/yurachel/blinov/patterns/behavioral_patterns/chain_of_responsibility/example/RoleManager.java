package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.example;

public class RoleManager extends AbstractHandler{
    public RoleManager(){}

    @Override
    public void handleRequest(Employee employee) {
    checkPermission();
    }
    public void checkPermission(){
        System.out.println("checking role");
        // checking role.
    }
}
