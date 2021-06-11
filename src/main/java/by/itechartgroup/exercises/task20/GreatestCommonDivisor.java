package by.itechartgroup.exercises.task20;

public class GreatestCommonDivisor {

    public static final int MIN_VALUE = 10;

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < MIN_VALUE || num2 < MIN_VALUE) {
            return -1;
        }
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }
}
