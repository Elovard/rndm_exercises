package by.itechartgroup.exercises.task12;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            throw new IllegalArgumentException("zero");
        }
        long milesPerHour = (long) (kilometersPerHour / 1.60d);
        System.out.println(kilometersPerHour + " km/h is " + milesPerHour + " mi/h");
        return Math.round(milesPerHour);
    }
}
