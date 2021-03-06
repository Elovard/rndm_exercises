package by.itechartgroup.exercises.task6;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        if (year <= 1 || year > 9999) {
            System.out.println("Invalid input");
            return false;
        }
        if (year % 4 != 0) {
            System.out.println("The year is not a leap year (it has 365 days)");
            return false;
        }
        if (year % 100 != 0) {
            return (year % 400 == 0);
        } else
            System.out.println("The year is a leap year (it has 366 days)");
        return true;
    }
}
