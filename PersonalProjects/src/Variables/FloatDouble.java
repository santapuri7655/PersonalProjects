package Variables;

public class FloatDouble {

    public static void main(String[] args)
    {
        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double numberOfPounds = 5d;
        float kilos = (float)(0.45359237 * numberOfPounds);

        System.out.println("value is: " + kilos);

    }
}
