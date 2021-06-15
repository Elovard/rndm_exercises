package by.itechartgroup.exercises.task7;

public class MegaBytesConverter {

    public static String printMegaBytesAndKiloBytes(int kiloBytes) throws Exception {
        if (kiloBytes < 0) {
            throw new IllegalArgumentException("Invalid value");
        }
        int megaBytes = kiloBytes / 1000;
        int remainder = kiloBytes % 1000;
        return (kiloBytes + " KB is " + megaBytes + " MB and " + remainder + " KB");
    }
}
