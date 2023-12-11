package algorithms_homework.homework_two.task_four;

public class TaskFour {

    public static void main(String[] args) {

        System.out.println(isPalindrome("STR rts STR RTS"));
    }

    static boolean isPalindrome(String str) {
        StringBuilder temp = new StringBuilder(str.toUpperCase());
        if (temp.length() == 1 || temp.length() == 0) {
            return true;
        }
        if (temp.charAt(0) == temp.charAt(temp.length() - 1)) {
            temp.deleteCharAt(0);
            temp.deleteCharAt(temp.length() - 1);
            isPalindrome(temp.toString());
            return true;
        } else {
            return false;
        }
    }
}
