/**
 * Problem:
 * Count number of set bits (1s)
 * in binary representation.
 */
public class CountSetBits {

    public static int countSetBits(int n) {

        int count = 0;

        while (n > 0) {

            // Check LSB
            if ((n & 1) != 0) {
                count++;
            }

            // Right shift
            n = n >> 1;
        }

        return count;
    }

    public static void main(String[] args) {

        int result = countSetBits(10);

        System.out.println("Set Bits: " + result);

        /*
         * 10 -> 1010
         * Number of 1s = 2
         */
    }
}