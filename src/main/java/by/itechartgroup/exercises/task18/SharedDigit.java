package by.itechartgroup.exercises.task18;

public class SharedDigit {

    public static final int MIN_RANGE = 10;
    public static final int MAX_RANGE = 99;

    public static boolean hasSharedDigit(int x, int y) {
        if (x < MIN_RANGE || x > MAX_RANGE) {
            return false;
        }
        if (y < MIN_RANGE || y > MAX_RANGE) {
            return false;
        }

        int lastDigOfX = x % 10;
        int firstDigOfX = x / 10;
        int lastDigOfY = y % 10;
        int firstDigOfY = y / 10;

        if ((lastDigOfX == lastDigOfY) || ((firstDigOfX == firstDigOfY))) {
            return true;
        }
        if ((lastDigOfX == firstDigOfY) || ((firstDigOfX == lastDigOfY))) {
            return true;
        }
        return false;
    }
}
