package ExercisesPartOne;

import static ExercisesPartOne.BarkingDog.shouldWakeUp;
import static ExercisesPartOne.MegaBytesConverter.printMegaBytesAndKiloBytes;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);

        boolean wakeup = shouldWakeUp (true, 8);

        if (wakeup) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
