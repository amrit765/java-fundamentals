/**
 * Problem:
 * Check whether a number is odd or even
 * using bit manipulation.
 */
public class OddEvenCheck {

    public static void checkOddEven(int n) {

        // Bitmask
        int bitMask = 1;

        /*
         * If LSB = 0 -> Even
         * If LSB = 1 -> Odd
         */
        if ((n & bitMask) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

    public static void main(String[] args) {

        checkOddEven(3);
        checkOddEven(4);
    }
}