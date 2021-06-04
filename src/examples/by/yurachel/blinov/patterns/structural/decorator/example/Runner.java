package examples.by.yurachel.blinov.patterns.structural.decorator.example;

//Создав экземпляр класса Employee, можно делегировать ему выполнение
//задач, связанных с разработчиком, тестировщиком или team-лидером, без со-
//здания специализированных подклассов.
public class Runner {
    public static void main(String[] args) {
        IEmployee employee = new TesterDecorator(new Employee("Ivanov"));
        employee.reopenTask();
        employee = new TeamLeadDecorator(new Employee("Petrov"));
        employee.openTask();
    }
}
