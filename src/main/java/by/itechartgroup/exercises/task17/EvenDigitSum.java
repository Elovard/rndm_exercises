package by.itechartgroup.exercises.task17;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int evenDigits = 0;
        int sum = 0;

        while (number > 0) {
            if (number % 2 == 0) {
                evenDigits = number % 10;
                sum += evenDigits;
            }
            number /= 10;
        }
        return sum;
    }
}
