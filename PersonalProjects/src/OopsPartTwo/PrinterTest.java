package OopsPartTwo;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer(100, 25, true);

        printer.printPage(25);
        printer.fillUpToner(50);
    }
}

