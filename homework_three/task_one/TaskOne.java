package algorithms_homework.homework_three.task_one;

import java.util.Arrays;

public class TaskOne {

    public static void main(String[] args) {


        //Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет
        //находиться на k-й позиции в конечном отсортированном массиве.
        //Массив 1 - 100 112 256 349 770
        //Массив 2 - 72 86 113 119 265 445 892
        //к = 7
        //Вывод : 256

        int[] arrOne = {100, 112, 256, 349, 770};
        int[] arrTwo = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        findMergedArrayElementByCount(arrOne, arrTwo, k);
    }

    public static void findMergedArrayElementByCount(int[] arrOne, int[] arrTwo, int k) {
        int i = 0;
        int j = 0;
        int arrIndex = 0;
        int[] mergedArray = new int[arrOne.length + arrTwo.length];

        while (i != arrOne.length && j != arrTwo.length) {
            if (arrOne[i] < arrTwo[j]) {
                mergedArray[arrIndex++] = arrOne[i++];
            } else if (arrOne[i] > arrTwo[j]) {
                mergedArray[arrIndex++] = arrTwo[j++];
            } else {
                mergedArray[arrIndex++] = arrOne[i++];
                mergedArray[arrIndex++] = arrTwo[j++];
            }
        }

        while (i < arrOne.length) {
            mergedArray[arrIndex++] = arrOne[i++];
        }

        while (j < arrTwo.length) {
            mergedArray[arrIndex++] = arrTwo[j++];
        }

        if (k - 1 > mergedArray.length) {
            System.out.println("Given count is out of arrays range!");
        } else {
            System.out.println(Arrays.toString(mergedArray));
            System.out.println(mergedArray[k - 1]);
        }
    }
}
