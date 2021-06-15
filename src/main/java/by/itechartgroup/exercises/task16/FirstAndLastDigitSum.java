package by.itechartgroup.exercises.task16;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("zero");
        }

        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number > 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        return (firstDigit + lastDigit);
    }
}
