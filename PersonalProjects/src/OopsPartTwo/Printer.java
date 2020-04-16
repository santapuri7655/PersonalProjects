package OopsPartTwo;

public class Printer {
    // Create a class and demonstate proper encapsulation techniques
    // the class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner Level, number of pages printed, and
    // also whether its a duplex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%), another method to
    // simulate printing a page (which should increase the number of pages printed).
    // Decide on the scope, whether to use constructors, and anything else you think is needed.

    public int tonerLevel = 100;
    public int numberOfPagesPrinted;
    public boolean isDuplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter){
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUpToner(int toner){
        if(toner < 100){
            this.tonerLevel = toner;
            System.out.println("Toner is at " + getTonerLevel());
        }
        else {
            System.out.println("toner reached maximum of 100%");
        }
    }

    public void printPage(int numberOfPagesPrinted){
        int i = 0;
        while (true){
            if(isDuplexPrinter){
                this.numberOfPagesPrinted = this.numberOfPagesPrinted + i/2;
            }
            else {
                this.numberOfPagesPrinted = this.numberOfPagesPrinted + i;
            }
            this.tonerLevel = this.tonerLevel - (i*7);
            i++;
            if(this.tonerLevel <= 0){
                break;
            }
        }
        System.out.println("Number of pages printed = "+ this.numberOfPagesPrinted);
    }

    public int getTonerLevel(){
        return tonerLevel;
    }
}
