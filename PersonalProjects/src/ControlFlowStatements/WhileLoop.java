package ControlFlowStatements;

public class WhileLoop {

    /**
     * Create a method called isEvenNumber that takes a parameter of type int
     * Its purpose is to determine if the argument passed to the method is
     * an even number or not.
     * return true if an even number, otherwise return false;
     */

    public static void main(String[] args)
    {
        int firstNumber = 56;
        int finishNumber = 98;

        while(firstNumber <= finishNumber)
        {
            firstNumber++;
            if(isEvenNumber(firstNumber))
            {
                System.out.println(firstNumber);
            }
        }
    }
    public static boolean isEvenNumber(int number)
    {
        if(number % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
