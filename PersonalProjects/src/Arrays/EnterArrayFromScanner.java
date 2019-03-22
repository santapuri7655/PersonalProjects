package Arrays;

import java.util.Scanner;

public class EnterArrayFromScanner {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] myInteger = getIntegers(5);
        double average = getAverage(myInteger);

        for(int i=0; i<myInteger.length; i++)
        {
            System.out.println("Number at position " + i + " is " + myInteger[i]);
        }

        System.out.println("Average of number is: " + average);
    }

    public static int[] getIntegers(int number)
    {
        int[] value = new int[number];
        System.out.println("Enter " + number + " numbers:");

        for(int i = 0; i<value.length; i++)
        {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static double getAverage(int[] number)
    {
        double sum = 0;

        for(int i=0; i<number.length; i++)
        {
            sum = sum + number[i];
        }
        double average = sum/number.length;
        return average;
    }
}
