package ExercisesPartOne;

public class EqualSumChecker
{
    public static void main(String[] args)
    {
        boolean hasEqualSum = hasEqualSum(1,1,1);
        if(hasEqualSum)
        {
            System.out.println("has equal sum");
        }
        else
        {
            System.out.println("sum is not equal");
        }
    }
    public static boolean hasEqualSum(int numOne, int numTwo, int numThree)
    {
        int sum = numOne + numTwo;
        if (sum == numThree)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}