package Week1;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class DecimalToBinary2 {

    public String convertDecimalToBinary(int number) {
        StringBuilder builder = new StringBuilder();

        while( number > 0) { //we can't work on 0
            int remainder = number % 2; //assign remainder to firstPick
            builder.append(remainder);
            number /= 2;
        }
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        DecimalToBinary2 decimalToBinary = new DecimalToBinary2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer number: ");
        int number = scanner.nextInt();
        String binary = decimalToBinary.convertDecimalToBinary(number);
        System.out.println("This is the binary output of " + number + " : " + binary);
    }
}
