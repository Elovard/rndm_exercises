package by.itechartgroup.exercises.task23;

public class NumberToWords {

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid value";
        }
        StringBuilder sb = new StringBuilder();
        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {
            switch (reverseNumber % 10) {
                case 0:
                    sb.append("Zero");
                    return "Zero ";
                case 1:
                    sb.append("One");
                    return "One ";
                case 2:
                    sb.append("Two");
                    return "Two ";
                case 3:
                    sb.append("Three");
                    return "Three ";
                case 4:
                    sb.append("Four");
                    return "Four ";
                case 5:
                    sb.append("Five");
                    return "Five ";
                case 6:
                    sb.append("Six");
                    return "Six ";
                case 7:
                    sb.append("Seven");
                    return "Seven ";
                case 8:
                    sb.append("Eight");
                    return "Eight ";
                case 9:
                    sb.append("Nine");
                    return "Nine ";
                default:
                    break;
            }
            reverseNumber /= 10;
        }
        return sb.toString();
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10; // 7
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}
