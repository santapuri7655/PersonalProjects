package ControlFlowStatements;

import java.util.Scanner;

public class UserInputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.println("You name is");
            String name = scanner.nextLine();

            int age = 2020 - year;
            if(age <= 0 || age > 100) {
                System.out.println("Invalid year of birth");
            }
            else {
                System.out.println("Your name is " + name + " and you are " + age + " years old.");
            }

        }
        scanner.close();
    }
}
