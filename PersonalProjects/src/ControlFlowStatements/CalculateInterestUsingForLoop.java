package ControlFlowStatements;

public class CalculateInterestUsingForLoop {

    public static void main(String[] args) {

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.
        for(int i = 2; i <=8; i++) {
            double calculatedInterestAmount = calculateInterest(10000, i);
            System.out.println("10,000 at rate of " + i + "% is " + String.format("%.2f", calculatedInterestAmount));
        }

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        for(int i = 8; i >=2 ; i--) {
            double calculatedInterestAmount = calculateInterest(10000, i);
            System.out.println("10,000 at rate of " + i + "% is " + String.format("%.2f", calculatedInterestAmount));
        }

        boolean number = isPrimeNumber(53);
        System.out.println(number);

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit

        int count = 0;
        for(int i=20; i<=50; i++) {
            boolean num = isPrimeNumber(i);
            if(num){
                count++;
                if(count > 3) {
                    break;
                }
                System.out.println(i);
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrimeNumber(int number) {
        if(number == 1) {
            return false;
        }
        for(int i=2; i <= number/2; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
