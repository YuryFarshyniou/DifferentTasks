package examples.by.yurachel.blinov.patterns.structural_patterns.decorator.example;

/*Класс EmployeeDecorator определяет для набора декораторов интер-
фейс, соответствующий интерфейсу класса IEmployee, и создает необходи-
мые ссылки.*/
public class EmployeeDecorator implements IEmployee {
    protected Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void openTask() {
        employee.resolveTask();
    }

    @Override
    public void reopenTask() {
        employee.reopenTask();
    }

    @Override
    public void resolveTask() {
        employee.resolveTask();
    }
}
