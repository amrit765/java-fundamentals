/**
 * Problem:
 * Calculate a^n efficiently
 *
 * Time Complexity:
 * O(log n)
 */
public class FastExponentiation {

    public static int fastExpo(int a, int n) {

        int ans = 1;

        while (n > 0) {

            /*
             * Check if current bit is 1
             */
            if ((n & 1) != 0) {
                ans = ans * a;
            }

            // Square the base
            a = a * a;

            // Right shift exponent
            n = n >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {

        int result = fastExpo(3, 5);

        System.out.println("Answer: " + result);

        /*
         * 3^5 = 243
         */
    }
}