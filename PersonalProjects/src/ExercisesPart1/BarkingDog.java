package ExercisesPart1;

public class BarkingDog
{
    public static void main(String[] args)
    {
        shouldWakeUp(true, -1);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if(barking)
        {
            if((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay <=23))
            {
                System.out.println("wake up!");
                return true;
            }
            else if(hourOfDay < 0 || hourOfDay > 23)
            {
                System.out.println("Invalid time");
                return false;

            }
            else
                return false;
        }
        else
            {
            System.out.println("Dog's not barking");
            return false;
            }
    }
}