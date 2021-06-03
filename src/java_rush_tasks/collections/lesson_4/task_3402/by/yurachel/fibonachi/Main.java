package java_rush_tasks.collections.lesson_4.task_3402.by.yurachel.fibonachi;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.fibonacci(9));     //34
        System.out.println(main.fibonacci(5));     //5
        System.out.println(main.fibonacci(2));     //1
        System.out.println(main.fibonacci(1));     //1
    }

    public int fibonacci(int n) {

        return (n <= 2) ? 1 : fibonacci(n - 2) + fibonacci(n - 1);
    }
}

