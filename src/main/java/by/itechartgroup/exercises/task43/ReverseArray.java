package by.itechartgroup.exercises.task43;

import java.util.Arrays;

public class ReverseArray {

    public static String reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfIndex = array.length / 2;

        for (int i = 0; i < halfIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        return Arrays.toString(array);
    }
}
