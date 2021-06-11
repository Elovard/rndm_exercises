package by.itechartgroup.exercises.task19;

public class LastDigitChecker {

    public static int MIN_RANGE = 10;
    public static int MAX_RANGE = 1000;

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1)) {
            return false;
        }
        if (!isValid(num2)) {
            return false;
        }
        if (!isValid(num3)) {
            return false;
        }

        int lastDigOfFirst = num1 % 10;
        int lastDigOfSecond = num2 % 10;
        int lastDigOfThird = num3 % 10;

        if ((lastDigOfFirst == lastDigOfSecond) || ((lastDigOfFirst == lastDigOfThird))
                || ((lastDigOfSecond == lastDigOfThird))) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int num) {
        if (num < MIN_RANGE || num > MAX_RANGE) {
            return false;
        }
        return true;
    }
}
