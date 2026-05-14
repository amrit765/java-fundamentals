/**
 * Demonstrates how to set ith bit
 *
 * Setting means:
 * Convert ith bit to 1
 */
public class SetIthBit {

    public static int setIthBit(int n, int i) {

        // Create bitmask
        int bitMask = 1 << i;

        // Set ith bit using OR
        return n | bitMask;
    }

    public static void main(String[] args) {

        int result = setIthBit(10, 2);

        System.out.println("Result: " + result);

        /*
         * 10 = 1010
         *
         * Set 2nd bit:
         * 1110 = 14
         */
    }
}