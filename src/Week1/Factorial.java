package Week1;

import java.util.Scanner;

public class Factorial {

    private static int myFactorialCalculator(int number) {
        //declare base case
        if(number == 1) {
            return 1;
        }
        return number * myFactorialCalculator(number - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the factorial number: ");
        int number = scanner.nextInt();
        int factorialNumber = myFactorialCalculator(number);
        System.out.println("The factorial of " + number + " is : " + factorialNumber + ".");
    }


}
