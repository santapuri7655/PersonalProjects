package ExercisesPart1;

public class AreaCalculator
{
    private static String INVALID_ERROR_MESSAGE = "Invalid Value";
    private static double RADIUS = 3.2;
    private static double LENGTH = 3.2;
    private static double WIDTH = 1.8;
    private static String AREA_OF_CIRCLE = "Area of circle is: ";
    private static String AREA_OF_RECTANGLE = "Area of rectangle is: ";
    private static double MINIMUM_VALUE = 0.0;
    private static double NEGATIVE_VALUE = -1;

    public static void main(String[] args)
    {
        double areaOfCircle = area(RADIUS);
        double areaOfRectangle = area(LENGTH, WIDTH);
        if(areaOfCircle < MINIMUM_VALUE || areaOfRectangle < MINIMUM_VALUE)
        {
            System.out.println(INVALID_ERROR_MESSAGE);
        }
        System.out.println(AREA_OF_CIRCLE + areaOfCircle);
        System.out.println(AREA_OF_RECTANGLE + areaOfRectangle);
    }
    private static double area(double radius)
    {
        if(radius < MINIMUM_VALUE)
        {
            return NEGATIVE_VALUE;
        }
        else
        {
            double area = Math.PI * radius * radius;
            return area;
        }
    }
    private static double area(double x, double y)
    {
        if(x < MINIMUM_VALUE || y < MINIMUM_VALUE)
        {
            return NEGATIVE_VALUE;
        }
        else
        {
            double area = x * y;
            return area;
        }
    }
}