package ControlFlowStatements;

public class ParsingValuesFromString {

    public static void main(String[] args) {
        String numberFromString = "2018";
        int number = Integer.parseInt(numberFromString);

        System.out.println("Number from string = " + numberFromString);
        System.out.println("Converted number = " + number);

        numberFromString += 1; //concatinating 1
        number += 1;

        System.out.println("Number from String = " + numberFromString);
        System.out.println("Converted number = " + number);
    }
}
