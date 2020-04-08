package Variables;

public class ByteIntLongShort {
    public static void main(String[] args)
    {
        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("my max integer value: " + myMaxIntValue);
        System.out.println("my min integer value: " + myMinIntValue);
        System.out.println("busted max value: " + (myMaxIntValue + 1));
        System.out.println("busted min value: " + (myMinIntValue - 1));

        int maxIntValue = 2147483647;

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("my max byte value: " + myMaxByteValue);
        System.out.println("my min byte value: " + myMinByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("my max short value: " + myMaxShortValue);
        System.out.println("my min short value: " + myMinShortValue);

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("my max long value: " + myMaxLongValue);
        System.out.println("my min long value: " + myMinLongValue);

        long myLeteralLongValue = 21474836471234L;
        System.out.println("my literal long value: " + myLeteralLongValue);
    }
}
