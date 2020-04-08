package Variables;

public class OperatorChallenge {

    public static void main(String[] args) {

        double firstVariable = 20d;
        double secondVariable = 80d;

        double sumOfVariables = (firstVariable + secondVariable) * 100;

        System.out.println("Sum is = " + sumOfVariables);

        double remainder = sumOfVariables % 40d;
        boolean var;

        if(remainder == 0){
            var = true;
        }
        else {
            var = false;
        }

        if(!var) {
            System.out.println("Got the reminder!");
        }

    }

}
