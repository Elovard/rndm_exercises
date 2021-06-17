package by.itechartgroup.exercises.task42;

import java.util.Scanner;

public class MinimumElement {

    public static Scanner scan = new Scanner(System.in);

    public static int[] readIntegers(int capacity) {
        int[] array = new int[capacity];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scan.nextInt();
            array[i] = number;
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int number = array[i];

            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
