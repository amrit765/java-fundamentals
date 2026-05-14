/**
 * Demonstrates how to update ith bit
 *
 * Update means:
 * Replace ith bit with newBit (0 or 1)
 */
public class UpdateIthBit {

    public static int clearIthBit(int n, int i) {

        int bitMask = ~(1 << i);

        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {

        /*
         * Method:
         * 1. Clear ith bit
         * 2. Set new value
         */

        n = clearIthBit(n, i);

        int bitMask = newBit << i;

        return n | bitMask;
    }

    public static void main(String[] args) {

        int result = updateIthBit(10, 1, 0);

        System.out.println("Updated Number: " + result);
    }
}