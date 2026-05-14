/**
 * Demonstrates how to clear last i bits
 *
 * Example:
 * n = 15 -> 1111
 * i = 2
 *
 * Output:
 * 1100 -> 12
 */
public class ClearLastIBits {

    public static int clearLastIBits(int n, int i) {

        // Create bitmask
        int bitMask = (~0) << i;

        return n & bitMask;
    }

    public static void main(String[] args) {

        int result = clearLastIBits(15, 2);

        System.out.println("Result: " + result);
    }
}
