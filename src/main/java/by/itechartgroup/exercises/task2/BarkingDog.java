package by.itechartgroup.exercises.task2;

public class BarkingDog {

    public static void main(String[] args) {
        shouldWakeUp(true, 23);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay > 24){
            System.out.println("Invalid time");
            return false;
        }

        if (hourOfDay < 0){
            System.out.println("Invalid time");
            return false;
        }

        if (barking && hourOfDay >= 22){
            System.out.println("We wake up");
            return true;
        }

        if (barking && hourOfDay < 8){
            System.out.println("We wake up");
            return true;
        }

        System.out.println("We don't wake up");
        return false;
    }
}
