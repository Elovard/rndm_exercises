package by.itechartgroup.exercises.task8;

public class MinutesToYearsAndDaysCalculator {

    public static String printYearsAndDays(long minutes) {
        if (minutes <= 0) {
            return "Invalid value";
        }
        long years = minutes / 525600;
        long days = (minutes % 525600) / 1400;
        return (years + " years, " + days + " d");
    }
}
