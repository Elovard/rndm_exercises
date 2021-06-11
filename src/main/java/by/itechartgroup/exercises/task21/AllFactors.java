package by.itechartgroup.exercises.task21;

public class AllFactors {

    public static String printFactors(int number) {
        StringBuilder sb = new StringBuilder();
        String result = sb.toString();
        if (number < 1) {
            return "Invalid value";
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    sb.append(i);
                    System.out.println(i);
                }
            }
        }
        return result;
    }
}
