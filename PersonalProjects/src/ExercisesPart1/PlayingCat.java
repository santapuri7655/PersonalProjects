package ExercisesPart1;

public class PlayingCat
{
    public static void main(String[] args)
    {
        boolean isCatPlaying = isCatPlaying(true, 10);
        if(isCatPlaying)
        {
            System.out.println("Cat is playing");
        }
        else
        {
            System.out.println("Cat is not playing");
        }
    }
    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        if(summer)
        {
            if(temperature >= 25 && temperature <= 45)
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
            if(temperature >= 25 && temperature <= 35)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
