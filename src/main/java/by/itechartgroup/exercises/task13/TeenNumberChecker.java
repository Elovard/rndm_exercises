package by.itechartgroup.exercises.task13;

public class TeenNumberChecker {

    public static final int MIN_ALLOWED_AGE = 13;
    public static final int MAX_ALLOWED_AGE = 19;

    public static boolean hasTeen(int age1, int age2, int age3) {
        // TODO: 6/10/21 replace else-ifs with early return
        if (age1 >= MIN_ALLOWED_AGE && age1 <= MAX_ALLOWED_AGE) {
            System.out.println("teen");
            return true;
        }

        if (age2 >= MIN_ALLOWED_AGE && age2 <= MAX_ALLOWED_AGE) {
            System.out.println("teen");
            return true;
        }

        if (age3 >= MIN_ALLOWED_AGE && age3 <= MAX_ALLOWED_AGE) {
            System.out.println("teen");
            return true;
            // TODO: 6/10/21 add braces
        }
        System.out.println("Nothing found");
        return false;
    }

    public static boolean isTeen(int age) {
        if (age >= MIN_ALLOWED_AGE && age <= MAX_ALLOWED_AGE) {
            System.out.println("teen");
            return true;
        } else
            System.out.println("Nothing found");
        return false;
    }
}
