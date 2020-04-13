package ExercisesPartTwo;

public class LargestPrimeNumber {
    /**
     * Write a method named getLargestPrime with one parameter of type int named number.
     *
     * If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
     *
     * The method should calculate the largest prime factor of a given number and return it.
     *
     *
     * EXAMPLE INPUT/OUTPUT:
     *
     * * getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
     *
     * * getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
     *
     * * getLargestPrime (0); should return -1 since 0 does not have any prime numbers
     *
     * * getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
     *
     * * getLargestPrime (-1); should return -1 since the parameter is negative
     *
     *
     * HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
     *
     * NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
     *
     * NOTE: Do not add a main method to the solution code.
     */

    public static void main(String[] args) {
        int largestPrime = getLargestPrime (16);
        System.out.println(largestPrime);
    }
    public static int getLargestPrime(int number) {
        int num = 0;
        int n = 0;
        int i = 1;
        if(number<=1){
            return -1;
        }
        else if(number == 2) {
            return number;
        }
        else if(number <= 10) {
            i++;
            while (number > 2) {
                if((number % i) == 1) {
                    if(number/i == 0) {
                        System.out.println("odd number divisible by a number");
                    }
                    else {
                        return number;
                    }
                }
                else {
                    num = number/i;
                    return num;
                }
                if(i > number) {
                    break;
                }
            }
        }

        while (number > 1) {
            int j = 1;
            if((number % i) == 0) {
                if((i % 2) != 0) {
                    while (i > j) {
                        j++;
                        if((i % j) == 0){
                            n = i/j;
                            num = n;
                            break;
                        }
                        else {
                            num = i;
                        }
                        if(j >= i/2) {
                            break;
                        }
                    }
                }
                if(i % 2 == 0) {
                    int k = 1;
                    while (i > 0) {
                        k++;
                        if(i % k == 0) {
                            if(k%2==0){
                                num = 2;
                            }
                            else{
                                num = i/k;
                                if(k > num) {
                                    num = k;
                                    break;
                                }

                            }

                        }
                        if(k > i/2){
                            break;
                        }
                    }
                }
            }
            i++;
            if(num == 0) {
                num = number;
            }
            if(i > number/2){
                break;
            }
        }
        return num;
    }
}
