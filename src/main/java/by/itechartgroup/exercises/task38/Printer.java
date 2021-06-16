package by.itechartgroup.exercises.task38;

public class Printer {

    private final int MIN_TONER_LEVEL = 0;
    private final int MAX_TONER_LEVEL = 100;
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) throws Exception {
        if (tonerLevel < MIN_TONER_LEVEL || tonerLevel > MAX_TONER_LEVEL) {
            throw new Exception("invalid argument");
        }
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) throws Exception {
        if (tonerAmount < MIN_TONER_LEVEL || tonerAmount > MAX_TONER_LEVEL) {
            throw new Exception("invalid argument");
        }
        if (tonerLevel + tonerAmount > 100) {
            throw new Exception("reached max level");
        }
        return (tonerLevel += tonerAmount);
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
