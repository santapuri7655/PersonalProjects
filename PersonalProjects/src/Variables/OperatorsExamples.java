package Variables;

public class OperatorsExamples {

    public static void main(String[] args) {

        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal to 20 or less.

        double firstVariable = 20d;
        double secondVariable = 80d;
        int thirdVariable = 22;
        boolean isCar = true;

        double sum = firstVariable + secondVariable;
        System.out.println("sum of double variables is " + sum);

        double multiply = sum * 25;
        System.out.println("multiply sum by 25 " + multiply);

        double remainder = multiply % 40;
        System.out.println("remainder from sum divided by 40 is " + remainder);

        if(remainder <= 20) {
            System.out.println("Total was over the limit");
        }

        if(thirdVariable > 10 && thirdVariable < 40) {
            System.out.println("number is between 20 and 40 and the number is: " + thirdVariable);
        }
        else {
            System.out.println("number is out of range");
        }

        if(isCar) {
            System.out.println("this is not supposed to happen");
        }
        else System.out.println("this is supposed to happen");
    }
}
