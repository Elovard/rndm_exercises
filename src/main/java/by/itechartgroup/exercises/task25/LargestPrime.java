package by.itechartgroup.exercises.task25;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 0) {
            return -1;
        }
        int i = 2;
        int largestPrime = number;
        while (i <= number) {
            if (number % i == 0) {
                if (number / i == 1) { // TODO: 6/14/21 Ask: how to avoid nested if here
                    largestPrime = i;
                    break;
                } else {
                    number = number / i;
                }
            } else {
                i++;
            }
        }
        return largestPrime;
    }
}
