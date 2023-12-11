package algorithms_homework.homework_two.task_three;

public class TaskThree {

    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(4));

    }

    static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return (n - 1) * -1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }
}
