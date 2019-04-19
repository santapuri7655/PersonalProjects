package ExercisesPartTwo;

public class NumberOfDaysInMonth
{
    public static void main(String[] args)
    {
        int numberOfDay = getDaysInMonth(2, 16000);

        if(numberOfDay < 0)
        {
            System.out.println("Invalid Entry");
        }
        else
        {
            System.out.println("Number of days in this month is " + numberOfDay);
        }
    }
    public static boolean isLeapYear(int year)
    {
        if(year >=1 && year <= 9999)
        {
            int leapYear1 = year % 4;
            int leapYear2 = year % 400;
            int leapYear3 = year % 100;
            if(leapYear1 == 0 && leapYear2 == 0 && leapYear3 == 0)
            {
                return true;
            }
            else if(leapYear1 == 0 && leapYear2 == 0 && leapYear3 != 0)
            {
                return true;
            }
            else if(leapYear1 == 0 && leapYear2 !=0 && leapYear3 != 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year)
    {
        if((month < 1 || month > 12) || (year < 1 || year > 9999))
        {
            return -1;
        }
        else
        {
            switch (month)
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12 :
                    return 31;
                case 2:
                    if(isLeapYear(year))
                    {
                        return 29;
                    }
                    else
                    {
                        return 28;
                    }
                case 4: case 6: case 9: case 11:
                    return 30;
                default:
                    return -1;
            }
        }
    }
}
