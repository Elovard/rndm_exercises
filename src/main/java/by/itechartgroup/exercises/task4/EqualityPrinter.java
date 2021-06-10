package by.itechartgroup.exercises.task4;

public class EqualityPrinter {

    // TODO: 6/10/21 Return string instead of sout-ing
    public static String printEqual(int param1, int param2, int param3) {
        if (param1 < 0 || param2 < 0 || param3 < 0) {
            return "Invalid value";
        }
        if (param1 == param2 && param2 == param3) {
            return "All numbers are equal";
        }
        if (param1 == param2 || param1 == param3 || param2 == param3) {
            return "Neither all are equal or different";
        }
        return "All numbers are different";
    }
}
