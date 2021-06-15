package by.itechartgroup.exercises.task10;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        boolean isValidYear = year > 0 && year <= 9999;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        return (isValidYear && isLeapYear);
    }

    public static int getDaysInMonth(final int month, final int year) {

        int[] dayInMonthCalendar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 30, 30, 31};

        if ((month <= 0 || month > 12 || (year <= 0 || year > 9999))) {
            return -1;
        }

        boolean leapYear = isLeapYear(year);


        if (!leapYear) {
            dayInMonthCalendar[1]++;
        }
        return dayInMonthCalendar[month];
    }
}
