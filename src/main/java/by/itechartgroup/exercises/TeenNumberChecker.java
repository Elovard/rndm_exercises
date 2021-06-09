package by.itechartgroup.exercises;

public class TeenNumberChecker {

    public static void main(String[] args) {
        hasTeen(1, 19, 55);
        isTeen(18);
    }

    public static boolean hasTeen(int age1, int age2, int age3){
        if(age1 >= 13 && age1 <= 19){
            System.out.println("teen");
            return true;
        } else if(age2 >= 13 && age2 <= 19){
            System.out.println("teen");
            return true;
        } else if(age3 >= 13 && age3 <= 19){
            System.out.println("teen");
            return true;
        } else
            System.out.println("Nothing found");
        return false;
    }

    public static boolean isTeen(int age){
        if(age >= 13 && age <= 19){
            System.out.println("teen");
            return true;
        } else
            System.out.println("Nothing found");
        return false;
    }
}
