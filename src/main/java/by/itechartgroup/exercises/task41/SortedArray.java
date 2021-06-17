package by.itechartgroup.exercises.task41;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static Scanner scan = new Scanner(System.in);

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int tempInt;

        while (flag) {
            flag = false;
            for (int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i] < sorted[i + 1]) {
                    tempInt = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = tempInt;
                    flag = true;
                }
            }
        }
        return sorted;
    }
}
