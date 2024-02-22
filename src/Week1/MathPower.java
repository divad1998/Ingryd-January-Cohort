package Week1;

public class MathPower {

    /**
     * Evaluates a number raised to the power of 0 or other positive integer numbers. Invalid exponents return 0.
     * @param base
     * @param exponent
     * @return result
     */
    private static long evaluate(long base, long exponent) {
        long result = 1;
        if (exponent < 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        for (int n = 0; n < exponent; n++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(evaluate(2, -1));
    }
}
