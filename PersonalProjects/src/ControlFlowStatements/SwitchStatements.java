package ControlFlowStatements;

public class SwitchStatements
{
    // Create a new switch statement using char instead of int
    // create a new char variable
    // create a switch statement testing for
    // A, B, C, D, or E
    // display a message if any of these are found and then break
    // Add a default which displays a message saying not found

    public static void main(String[] args)
    {
        char c = 'd';
        switch (c)
        {
            case 'a':
                System.out.println("print letter A");
                break;
            case 'b':
                System.out.println("print letter B");
                break;
            case 'c':
                System.out.println("print letter C");
                break;
            case 'd':
                System.out.println("print letter D");
                break;
            case 'e':
                System.out.println("print letter E");
                break;
            default:
                System.out.println("this letter is not found");
                break;
        }
    }
}