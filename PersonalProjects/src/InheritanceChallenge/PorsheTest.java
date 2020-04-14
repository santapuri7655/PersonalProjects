package InheritanceChallenge;

public class PorsheTest {
    private static int GEARS = 6;
    private static int SEATS = 5;
    private static String COLOR = "black";
    private static int ENGINE = 1;
    private static String MODEL = "sport";
    private static String INTERIOR = "grey";
    private static int HAND_STEERING = 1;
    private static int BASE_GEARS = 2;

    public static void main(String[] args) {
        Porshe carrera = new Porshe(GEARS, SEATS, COLOR, ENGINE, MODEL, INTERIOR);
        Base baseCar = new Base(HAND_STEERING, BASE_GEARS);

        baseCar.getGears();
        System.out.println("number of gears for base car = " + baseCar.getGears());
        carrera.getEngine();
        carrera.getModel();
        carrera.changingGears(GEARS);
        carrera.moving(80);
        System.out.println("seats = "+ carrera.getSeats());
        System.out.println("engine = " + carrera.getEngine());
        System.out.println("model = "+ carrera.getModel());
    }
}
