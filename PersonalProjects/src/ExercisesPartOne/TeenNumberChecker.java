package ExercisesPartOne;

public class TeenNumberChecker
{
    public static void main(String[] args)
    {
        boolean hasTeen = hasTeen(9, 99, 19);
        if(hasTeen)
        {
            System.out.println("has teen");
        }
        else
        {
            System.out.println("has no teen");
        }
        boolean isTeen = isTeen(9);
        if (isTeen)
        {
            System.out.println("is teen");
        }
        else
        {
            System.out.println("is not teen");
        }
    }
    public static boolean hasTeen(int numOne, int numTwo, int numThree)
    {
        if ((numOne >= 13 && numOne <= 19) ||
                (numTwo >= 13 && numTwo <=19) ||
                (numThree >= 13 && numThree <= 19))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isTeen(int num)
    {
        if(num >= 13 && num <=19)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}