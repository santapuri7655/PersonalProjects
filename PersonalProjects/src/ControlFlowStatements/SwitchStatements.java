package ControlFlowStatements;

public class SwitchStatements
{
    public static void main(String[] args) {

        int switchValue = 2;

        switch (switchValue) {
            case 1:
                System.out.println("value is 1");
                break;

            case 2:
                System.out.println("value is 2");
                break;

            case 3:
                System.out.println("value is 3");
                break;

            case 4: case 5: case 6:
                System.out.println("value is either 4, 5 or 6");
                break;

            default:
                System.out.println("none of the above");
                break;
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char switchChar = 'D';

        switch (switchChar) {
            case 'A':
                System.out.println("Value is 'A'");
                break;

            case 'B':
                System.out.println("Value is 'B'");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("Value is " + switchChar);
                break;

            default:
                System.out.println("not found");
        }

        String month = "JANUARY";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not valid");
                break;
        }
    }
}