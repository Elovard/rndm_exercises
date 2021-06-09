package by.itechartgroup.exercises;

public class SpeedConverter {

    public static void main(String[] args) {
        toMilesPerHour(228.8);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid value");
            return -1;
        }
        long milesPerHour = (long) (kilometersPerHour / 1.60d);
        System.out.println(kilometersPerHour + " km/h is " + milesPerHour + " mi/h");
        return Math.round(milesPerHour);
    }
}
