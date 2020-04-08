package Variables;

public class BooleanCharChallenge {

    public static void main(String[] args)
    {
        char myChar = '\u2122';
        System.out.println("my trademark sign is " + myChar);

        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        char myCharForCopyRight = '\u00A9';
        System.out.println("my copy right sign is " + myCharForCopyRight);
    }
}
