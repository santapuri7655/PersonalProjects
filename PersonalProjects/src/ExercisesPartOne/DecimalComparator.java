package ExercisesPartOne;

/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


EXAMPLES OF INPUT/OUTPUT:

* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.


TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */

public class DecimalComparator
{
    public static void main(String[] args) {
        boolean equals = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        if(equals){
            System.out.println("Both numbers are equal");
        }
        else {
            System.out.println("The numbers are not equal");
        }
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double threeDecimalNum1 = num1 * 1000;
        int n1 = (int) threeDecimalNum1;
        double threeDecimalNum2 = num2 * 1000;
        int n2 = (int) threeDecimalNum2;

        if (n1 == n2) {
            return true;
        }
        else
            return false;
    }
}