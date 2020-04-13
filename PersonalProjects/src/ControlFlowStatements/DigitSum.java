package ControlFlowStatements;

public class DigitSum {
    /**
     * Write a method with the name sumDigits that has one int parameter called number.
     *
     * If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
     *
     * The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process negative numbers, so also return -1 for negative numbers.
     *
     * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
     *
     * Calling the method sumDigits(1) should return -1 as per requirements described above.
     *
     * Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
     *
     * Hint:
     * 	Use n % 10 to extract the least-significant digit.
     * 	Use n = n / 10 to discard the least-significant digit.
     * 	The method needs to be static like other methods so far in the course.
     *
     * Tip:
     * 	Create a project with the name DigitSumChallenge.
     *
     */

    public static void main(String[] args) {
        int sum = sumODigits(1250);
        System.out.println(sum);
    }

    public static int sumODigits(int number) {

        int sum = 0;
        int n = 0;

        if(number>=10) {
            while (number > 0){
                n = number % 10;
                sum = sum +n;
                number = number/10;
            }

            return sum;
        }
        else if(number < 0){
            return -1;
        }
        else {
            return -1;
        }

    }
}
