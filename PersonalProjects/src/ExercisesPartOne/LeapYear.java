package ExercisesPartOne;

public class LeapYear
{
    public static void main(String[] args) {
        boolean year = isLeapYear(1800);
        if(year)
        {
            System.out.println("is leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
    public static boolean isLeapYear(int year)
    {
        if(year < 1 || year > 9999)
        {
            System.out.println("Invalid date");
            return false;
        }
        else {
            int leapYear1 = year % 4;
            int leapYear2 = year % 400;
            int leapYear3 = year % 100;

            if (leapYear1 == 0 && leapYear2 != 0 && leapYear3 != 0) {
                return true;
            } else if (leapYear1 == 0 && leapYear2 == 0 && leapYear3 == 0) {
                return true;
            } else if (leapYear1 == 0 && leapYear2 != 0 && leapYear3 == 0) {
                return false;
            } else {
                return false;
            }
        }
    }
}