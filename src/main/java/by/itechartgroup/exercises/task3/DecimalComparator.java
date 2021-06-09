package by.itechartgroup.exercises.task3;

public class DecimalComparator {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.175, 3.176);
    }

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2){
        if((int) (param1 * 1000) == (int) (param2 * 1000)){
            System.out.println("Equal");
            return true;
        } else
            System.out.println("Not equal");
            return false;
    }
}
