package by.itechartgroup.exercises.task7;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1337);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid value");
        } else {
            int megaBytes = kiloBytes / 1000;
            int remainder = kiloBytes % 1000;
            System.out.println(kiloBytes + " KB is " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}
