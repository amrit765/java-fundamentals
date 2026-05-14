/**
 * Demonstrates how to get ith bit of a number
 *
 * Example:
 * n = 10 -> 1010
 * i = 1
 *
 * Output = 1
 */
public class GetIthBit {

    public static int getIthBit(int n, int i) {

        // Create bitmask
        int bitMask = 1 << i;

        /*
         * If result is 0 -> ith bit is 0
         * Otherwise -> ith bit is 1
         */
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        int result = getIthBit(10, 1);

        System.out.println("ith Bit: " + result);
    }
}
