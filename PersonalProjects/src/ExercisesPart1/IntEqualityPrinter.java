package ExercisesPart1;

public class IntEqualityPrinter
{
    public static void main(String[] args)
    {
        printEqual(1, 1, 2);
    }
    public static void printEqual(int numOne, int numTwo, int numThree)
    {
        if(numOne < 0 || numTwo < 0 || numThree < 0)
        {
            System.out.println("Invalid Value");
        }
        else if(numOne == numTwo)
        {
            if(numTwo == numThree)
            {
                System.out.println("All numbers are equal");
            }
            else if(numTwo != numThree)
            {
                System.out.println("Neither all are equal or different");
            }
        }
        else if(numTwo == numThree)
        {
            if(numThree != numOne)
            {
                System.out.println("Neither all are equal or different");
            }
        }
        else if(numOne == numThree)
        {
            if(numThree != numTwo)
            {
                System.out.println("Neither all are equal or different");
            }
        }
        else
        {
            System.out.println("All numbers are different");
        }
    }
}