package Week1;

import java.util.Scanner;

public class ForLoopFactorial {

    private static int myFactorialCalculator(int number) {
        int total = 1;
        if(number == 1) {
            return 1;
        }

        for(int i = 1; i <= number; i++) {
            total *= i;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the factorial number: ");
        int number = scanner.nextInt();
        int factorialNumber = myFactorialCalculator(number);
        System.out.println("The factorial of " + number + " is : " + factorialNumber + ".");
    }
}
