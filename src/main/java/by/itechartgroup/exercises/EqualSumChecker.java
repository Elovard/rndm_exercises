package by.itechartgroup.exercises;

public class EqualSumChecker {

    public static void main(String[] args) {
        hasEqualSum(3,3,2);
    }

    public static boolean hasEqualSum(int sum1, int sum2, int sum3){
        if(sum1 + sum2 == sum3){
            System.out.println("Equal");
            return true;
        } else
            System.out.println("Not equal");
        return false;
    }
}
