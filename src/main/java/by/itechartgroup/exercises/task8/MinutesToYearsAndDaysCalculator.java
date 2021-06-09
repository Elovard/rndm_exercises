package by.itechartgroup.exercises.task8;

public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes <= 0)
            System.out.println("Invalid value");
        long years = minutes / 525600;
        long days = (minutes % 525600) / 1400;
        System.out.println(years + " years, " + days + " d");
    }
}
