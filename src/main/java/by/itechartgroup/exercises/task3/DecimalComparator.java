package by.itechartgroup.exercises.task3;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
        // TODO: 6/10/21 create variables
        // TODO: 6/10/21 APPLY AUTO FORMATTER EVERYWHERE!!!!!!!!!
        int castedParam1 = (int) param1 * 1000;
        int castedParam2 = (int) param2 * 1000;
        if (castedParam1 == castedParam2) {
            System.out.println("Equal");
            return true;
        }
        System.out.println("Not equal");
        return false;
    }
}
