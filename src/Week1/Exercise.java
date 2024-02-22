package Week1;

public class Exercise {
    public static void main(String[] args) {
    //countDownwardsFrom15();
        //printEvenNumbersFrom2To30();
        //printHelloWorldFiveTimes();
        //print1To25();
    }

    /**
     * A for-loop to count downwards from 15 to 1
     */
    private static void countDownwardsFrom15() {
        for (int i = 15; i >= 0; i--) {
            System.out.println(i);
        }
    }

    /**
     * print even numbers between 2 and 20 (inclusive)
     */
    private static void printEvenNumbersFrom2To30() {
        int number = 2;
        while(number <= 30) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            //increment number
            number++;
        }
    }

    /**
     * Prints 'Hello World' five times.
     */
    private static void printHelloWorldFiveTimes() {
        int count = 1;
        do {
            System.out.println("Hello World");
            count++;
        } while (count < 6);
    }

    private static void print1To25() {
        for (int i = 1; i <= 25; i++) {
            if (i % 4 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }

    private static void sumAfter5Counts() {
        int number = 1;
        int count = 1;
        int[] array = new int[4];
        int arrayIndex = 0;
        do {
            if (count == 5) {
                array[arrayIndex] =
            }
            number++;


        }
    }
}
