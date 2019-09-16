package Variables;

public class FloatDouble
{
    public static void main(String[] args)
    {
        float myMaxFloatNum = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("my max float value: " + myMaxFloatNum);
        System.out.println("my min float value: " + myMinFloatValue);

        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("my max double value: " + myMaxDoubleValue);
        System.out.println("my min double value: " + myMinDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f / 3f ;
        double myDoubleValue = 5.00/3.00;

        System.out.println("My int value: " + myIntValue);
        System.out.println("my float value: " + myFloatValue);
        System.out.println("my double value: " + myDoubleValue);
    }
}
