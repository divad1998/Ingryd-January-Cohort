package Week1;

public class Exercise {
    public static void main(String[] args) {
    //countDownwardsFrom15();
        //printEvenNumbersFrom2To30();
        //printHelloWorldFiveTimes();
        //print1To25();
        sumAfter5Counts(2, 3);
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

    /**
     * Increments the starting number by the incrementer per-loop and prints the sum after every five loops. Loops 20 times.
     * @param startingNum
     * @param incrementer
     */
    private static void sumAfter5Counts(int startingNum, int incrementer) {
        int loopCount = 1;
        int iterationCount = 1;
        int[] sumArray = new int[4];
        int arrayIndex = 0;

        do {
            startingNum += incrementer;
            if (iterationCount == 5) {
                    sumArray[arrayIndex] = startingNum;
                    arrayIndex++;
                    iterationCount = 0;
            }
            iterationCount++;
            loopCount++;
        }while(loopCount <= 20);

        System.out.println("Series 1 total: " + sumArray[0]);
        System.out.println("Series 2 total: " + sumArray[1]);
        System.out.println("Series 3 total: " + sumArray[2]);
        System.out.println("Series 4 total: " + sumArray[3]);
        int sumTotal = sumArray[0] + sumArray[1] + sumArray[2] + sumArray[3];
        System.out.println("Total Summation: " + sumTotal);
    }
}