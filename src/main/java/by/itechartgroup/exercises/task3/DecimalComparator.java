package by.itechartgroup.exercises.task3;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2){
        if((int) (param1 * 1000) == (int) (param2 * 1000)){
            System.out.println("Equal");
            return true;
        } else
            System.out.println("Not equal");
            return false;
    }
}
