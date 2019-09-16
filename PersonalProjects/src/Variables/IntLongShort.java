package Variables;

public class IntLongShort {

    // 1. Create a byte variable and set it to any valid byte number.
    // 2. Create a short variable and set it to any valid short number.
    // 3. Create a int variable and set it to any valid int number.
    // 4. Create a variable of type long, and make it equal to
    //    50000 + 10 times the sum of the byte, plus the short plus the int

    public static void main(String[] args)
    {
        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

        System.out.println("My int Value: " + myIntValue);
        System.out.println("My Byte value: " + myByteValue);
        System.out.println("My Short value: " + myShortValue);

        System.out.println("My long value is = sum of Int, Short and Byte" + myLongValue);
    }
}
