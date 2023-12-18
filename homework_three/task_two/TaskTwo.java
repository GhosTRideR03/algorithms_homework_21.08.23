package algorithms_homework.homework_three.task_two;

public class TaskTwo {

    public static void main(String[] args) {
        String inputString = "poiuytrewqlkjhgfdsamnbvcxz";
        String result = alphabeticalSort(inputString);

        System.out.println(result);
    }

    static String merge(String left, String right) {
        int i = 0;
        int j = 0;
        StringBuilder result = new StringBuilder();
        char[] arrLeft = left.toCharArray();
        char[] arrRight = right.toCharArray();
        while (i < arrLeft.length && j < arrRight.length) {
            if (arrLeft[i] < arrRight[j]) {
                result.append(arrLeft[i++]);
            } else {
                result.append(arrRight[j++]);
            }
        }

        while (i < arrLeft.length) {
            result.append(arrLeft[i++]);
        }

        while (j < arrRight.length) {
            result.append(arrRight[j++]);
        }

        return result.toString().toUpperCase();
    }

    static String alphabeticalSort(String str) {
        if (str.length() == 1) {
            return str.toUpperCase();
        }
        int mid = str.length() / 2;
        String left = str.substring(0,mid);
        String right = str.substring(mid);

        left = alphabeticalSort(left);
        right = alphabeticalSort(right);

        return merge(left,right);
    }
}
