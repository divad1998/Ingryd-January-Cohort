package Week1;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StringAndIntReaderExercise {

    static void readInteger() {
        try {
            System.out.println("Enter five integers and I will add them to an array and print the array.");
            Scanner scanner = new Scanner(System.in);
            int[] intArray = new int[5];
            for(int i = 0; i < 5;  i++) {
                System.out.print("Enter integer: ");
                int integer = scanner.nextInt();
                intArray[i] = integer;
                System.out.println();
            }

            System.out.println("[" + intArray[0] + ", " + intArray[1] + ", " + intArray[2] + ", " + intArray[3] + ", " + intArray[4] + "]");

        } catch (InputMismatchException e) {
            System.out.println("Error. Only integers are allowed.");
        }

    }

    static void readString() {
        System.out.println("Enter five strings and I will add them to an array and print the array.");
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[5];

        for (int i = 0; i < 5;  i++) {
            System.out.print("Enter string: ");
            String string = scanner.nextLine();
            strings[i] = string;
            System.out.println();
        }

        System.out.println("[" + strings[0] + ", " + strings[1] + ", " + strings[2] + ", " + strings[3] + ", " + strings[4] + "]");

    }
    public static void main(String[] args) {
        //readInteger();
        readString();
    }
}
