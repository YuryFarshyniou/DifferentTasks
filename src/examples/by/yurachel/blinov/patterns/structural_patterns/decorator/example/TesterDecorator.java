package examples.by.yurachel.blinov.patterns.structural_patterns.decorator.example;

public class TesterDecorator extends EmployeeDecorator {
    //fields methods.

    public TesterDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void openTask() {
        super.openTask();
    }

    @Override
    public void reopenTask() {
        super.reopenTask();
        testing();
    }

    @Override
    public void resolveTask() {
        super.resolveTask();
    }

    public void testing() {
        System.out.println(employee.getName() + " testing task");
    }

    public void reporting() {
        System.out.println(employee.getName() + " create report.");
    }
}
