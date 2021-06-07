package examples.by.yurachel.blinov.patterns.structural_patterns.decorator.example;

/*Класс DeveloperDecorator объявляет дополнительные функциональности
startProgress() и endProgress(), необходимые для разработчика, дополняя (декори-
руя) функциональности openTask(), reopenTask(), resolveTask() класса Employee.*/

public class DeveloperDecorator extends EmployeeDecorator {
    //fields,methods.


    public DeveloperDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void openTask() {
        super.openTask();
        startProgress();
    }

    @Override
    public void reopenTask() {
        super.reopenTask();
        startProgress();
    }

    @Override
    public void resolveTask() {
        super.resolveTask();
        stopProgress();
    }

    public void startProgress() {
        System.out.println(employee.getName() + " starting task");

    }

    public void stopProgress() {
        System.out.println(employee.getName() + " stopping task");
    }
}
