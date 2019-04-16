package ExercisesPart1;

public class DecimalComparator
{
    public static void main(String[] args)
    {
        boolean areEqual = areEqualByThreeDecimalPlaces(3.175, 3.176);
        if(areEqual)
        {
            System.out.println("Are equal by three decimal places");
        }
        else
        {
            System.out.println("Are not equal");
        }
    }
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo)
    {
       int num1 = (int) (numberOne * 1000);
       int num2 = (int) (numberTwo * 1000);

       if (num1 == num2)
       {
           return true;
       }
       else
       {
           return false;
       }
    }
}