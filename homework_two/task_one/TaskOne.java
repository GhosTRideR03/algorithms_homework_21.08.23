package algorithms_homework.homework_two.task_one;

public class TaskOne {

    public static void main(String[] args) {
        isPower(128);

    }

    static int isPower(int n) {
        if (n == 2) {
//            System.out.println(n);
            System.out.println("Yes");
            return n;
        } else if (n < 2) {
            System.out.println("No it's not");
//            System.out.println(n);
            return n;
        } else if (n % 2 == 0) {
//            System.out.println(n);
            return isPower(n / 2);
        } else {
            System.out.println("No it's not");
            return n;
        }
    }
}
