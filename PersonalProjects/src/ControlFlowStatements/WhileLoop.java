package ControlFlowStatements;

public class WhileLoop {

    public static void main(String[] args)
    {
        int count = 1;
        while(count != 6) {
            System.out.println("number is " + count);
            count++;
        }

        count = 1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("number is " + count);
            count++;
        }

        int number = 4;
        int finishNumber = 20;
        count = 0;
        int sum = 0;
// Sum of even numbers
        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            sum = sum + number;
            System.out.println("number is " + number);
        }
        System.out.println("Total sum = " + sum);

// Total number of even numbers with a range
        while (number <= finishNumber) {
            if(isEvenNumber(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }
        System.out.println("Number of even numbers found = " + count);

// Break after 5 even numbers
        while (true) {
            if(isEvenNumber(number)) {
                System.out.println(number);
                count++;
                if(count >= 5){
                    break;
                }
            }
            number++;
            if(number > finishNumber) {
                break;
            }
        }
    }



    /**
     * Create a method called isEvenNumber that takes a parameter of type int
     * Its purpose is to determine if the argument passed to the method is
     * an even number or not.
     * return true if an even number, otherwise return false;
     */

    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
