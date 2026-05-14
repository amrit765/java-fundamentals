/**
 * Demonstrates how to clear ith bit
 *
 * Clearing means:
 * Convert ith bit to 0
 */
public class ClearIthBit {

    public static int clearIthBit(int n, int i) {

        // Create bitmask
        int bitMask = ~(1 << i);

        // Clear ith bit using AND
        return n & bitMask;
    }

    public static void main(String[] args) {

        int result = clearIthBit(10, 1);

        System.out.println("Result: " + result);

        /*
         * 10 = 1010
         *
         * Clear 1st bit:
         * 1000 = 8
         */
    }
}