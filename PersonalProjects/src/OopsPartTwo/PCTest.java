package OopsPartTwo;

public class PCTest {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(5, 20, 20);
        Case theCase = new Case("220B", "Dell", "120", dimensions);
        Resolution resolution = new Resolution(20, 10);
        Monitor theMonitor = new Monitor("27inch beast", "Acer", 27, resolution);
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PC pc = new PC(theCase, theMonitor, theMotherBoard);
        pc.getMonitor().getPixelAt(3,6, "red");
        pc.getMotherBoard().loadProgram("start program");
        pc.getTheCase().pressPowerButton();
        System.out.println("power supply = " + pc.getTheCase().getPowerSupply());

    }
}
