package examples.by.yurachel.blinov.patterns.behavioral_patterns.chain_of_responsibility.example;

public class Authentification extends AbstractHandler {
    @Override
    public void handleRequest(Employee employee) {
        if (checkStatus(employee)) {
            //some code here
        }
    }

    public boolean checkStatus(Employee user) {
        boolean flag = true;
        System.out.println(user);
        System.out.println("check user status.");
        //check user status
        return flag;
    }
}
