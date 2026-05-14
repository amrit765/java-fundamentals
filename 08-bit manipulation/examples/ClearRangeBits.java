/**
 * Demonstrates how to clear bits in range i to j
 */
public class ClearRangeBits {

    public static int clearBitsInRange(int n, int i, int j) {

        /*
         * Create mask:
         *
         * a = all 1s before j
         * b = all 1s after i
         */

        int a = (~0) << (j + 1);

        int b = (1 << i) - 1;

        int bitMask = a | b;

        return n & bitMask;
    }

    public static void main(String[] args) {

        int n = 2515;

        int result = clearBitsInRange(n, 2, 7);

        System.out.println("Result: " + result);
    }
}
