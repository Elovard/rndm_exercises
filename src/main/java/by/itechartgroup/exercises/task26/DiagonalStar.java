package by.itechartgroup.exercises.task26;

public class DiagonalStar {

    public static String printSquareStar(int number) {
        if (number < 5) {
            return "Invalid value";
        }
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {
                if ((row == 1) || (row == number) || (column == 1) || column == number) {
                    System.out.print("*");
                } else if (row == column) {
                    System.out.print("*");
                } else if (column == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
        return "";
    }
}
