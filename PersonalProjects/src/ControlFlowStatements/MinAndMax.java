package ControlFlowStatements;

import java.util.Scanner;

/**
 * -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 *
 * Hint:
 * -Use an endless while loop.
 *
 * Bonus:
 * -Create a project with the name MinAndMaxInputChallenge.
 */

public class MinAndMax {

    public static void main(String[] args) {
        int minNumber = 0;
        int maxNumber = 0;
        boolean first = true;
        Scanner scanner= new Scanner(System.in);

        while (true) {
            System.out.println("Enter number: ");
            boolean hasInt = scanner.hasNextInt();
            if(hasInt) {
                int number = scanner.nextInt();
                if(first) {
                    first = false;
                    maxNumber = number;
                    minNumber = number;
                }
                if(number > maxNumber) {
                    maxNumber = number;
                }
                if(number < minNumber) {
                    minNumber = number;
                }
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min number entered is: " + minNumber + " and Max number entered is: " + maxNumber);
        scanner.close();
    }
}
