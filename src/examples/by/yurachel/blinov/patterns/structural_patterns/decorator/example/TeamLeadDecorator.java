package examples.by.yurachel.blinov.patterns.structural_patterns.decorator.example;

/*Классы TesterDecorator и TeamLeadDecorator каждый в свою очередь до-
бавляют функциональность, свойственную его деятельности, но никак не меня-
ющую функциональность основного класса Employee.*/
public class TeamLeadDecorator extends EmployeeDecorator {
    //    Fields and methods.
    public TeamLeadDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void openTask() {
        super.openTask();

    }

    @Override
    public void reopenTask() {
        super.reopenTask();
    }

    @Override
    public void resolveTask() {
        super.resolveTask();
    }

    public void assignTask() {
        System.out.println(employee.getName() + " is assigning task");
    }

    public void changeEmployee() {
        System.out.println(employee.getName() + " is changing employee.");
    }

    public void closeTask() {
        System.out.println(employee.getName() + " is closing task.");
    }
}
