package ExercisesPartTwo;

public class NumberPalindrome
{
    public static void main(String[] args)
    {
        boolean isPalindrome = isPalindrome(3443);
        if(isPalindrome)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome. It is just a plain number!");
        }
    }
    public static boolean isPalindrome(int number)
    {
        int reverse = 0;
        int reverseNumber = 0;
        while (number > 0)
        {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverseNumber = reverse + lastDigit;
            number = number/10;
        }
        if(reverseNumber == number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
