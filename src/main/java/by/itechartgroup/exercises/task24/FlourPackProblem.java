package by.itechartgroup.exercises.task24;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        bigCount *= 5;
        return bigCount + smallCount >= goal && smallCount >= goal % 5;
    }
}
