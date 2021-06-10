package by.itechartgroup.exercises.task10;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        return ((year > 0 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)));
    }

    public static int getDaysInMonth(final int month, final int year) {
        // TODO: 6/10/21 remove first arg
        int[] dayInMonthCalendar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 30, 30, 31};

        // TODO: 6/10/21 fix naming
        int daysInMonth = 0;
        if ((month <= 0 || month > 12 || (year <= 0 || year > 9999))) {
            return -1;
        }

        boolean leapYear = isLeapYear(year);

        // TODO: 6/10/21 refactor (simplify)
        if (!leapYear) {
            daysInMonth = dayInMonthCalendar[month];
        } else {
            dayInMonthCalendar[1]++;
            daysInMonth = dayInMonthCalendar[month];
            if (month == 1) {
                daysInMonth = dayInMonthCalendar[month];
            }
        }
        return daysInMonth;
    }
}
