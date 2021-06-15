package by.itechartgroup.exercises.task27;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        double average = 0;
        double counter = 0;
        while (true) {
            System.out.println("Enter number: ");
            boolean isNextInt = scan.hasNextInt();
            if (isNextInt) {
                num = scan.nextInt();
                counter++;
                sum += num;
                average = sum / counter;
            } else {
                System.out.println("Sum: " + sum + ", average: " + Math.round(average));
                break;
            }
            scan.nextLine();
        }
        scan.close();
    }
}
