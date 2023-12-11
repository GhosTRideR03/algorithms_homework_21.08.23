package algorithms_homework.homework_two.task_two;

public class TaskTwo {

    public static void main(String[] args) {
        int n = 200;
        System.out.println(sumOfDigitsRecursive(n));
    }

    static int sumOfDigitsRecursive(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumOfDigitsRecursive(n / 10);
    }
}
