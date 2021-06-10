package by.itechartgroup.exercises.task10;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        return ((year > 0 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)));
    }

    public static int getDaysInMonth(int month, int year) {
        int[] DayInMonthCalendar = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 30, 30, 31};
        int DaysInMonth = 0;
        if ((month <= 0 || month > 12 || (year <= 0 || year > 9999))) {
            return -1;
        }

        boolean leapYear = isLeapYear(year);

        if (!leapYear) {
            DaysInMonth = DayInMonthCalendar[month];
        } else {
            DayInMonthCalendar[2]++;
            DaysInMonth = DayInMonthCalendar[month];
            if (month == 2) {
                DaysInMonth = DayInMonthCalendar[month];
            }
        }
        return DaysInMonth;
    }
}
