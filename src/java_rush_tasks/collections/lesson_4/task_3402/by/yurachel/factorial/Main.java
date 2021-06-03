package java_rush_tasks.collections.lesson_4.task_3402.by.yurachel.factorial;

public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(9));     //362880
        System.out.println(factorial(0));     //1
        System.out.println(factorial(1));     //1
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(--n);
        }
    }

}

