package Week1;

import java.util.Scanner;

public class DecimalToBinary {

    public String convertDecimalToBinary(int number) {
        String binaryString = "";

        while( number > 0) { //we can't work on 0
            int remainder = number % 2;
            binaryString += remainder;
            number /= 2;
        }

        return reverseString(binaryString);
    }

    private String reverseString(String string) {
        String reversed = "";
        int lastIndex = string.length() - 1;
        while( lastIndex >= 0 ){
            reversed += string.charAt(lastIndex);
            //reversed.concat(String.valueOf(string.charAt(lastIndex)));
            lastIndex--;
        }
        return reversed;
    }

    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer number: ");
        int number = scanner.nextInt();
        String binary = decimalToBinary.convertDecimalToBinary(number);
        System.out.println("This is the binary output of " + number + " : " + binary);
    }
}
