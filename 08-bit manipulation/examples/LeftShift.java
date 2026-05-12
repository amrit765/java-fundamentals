/**
 * Demonstrates Left Shift (<<)
 *
 * Formula:
 * a << b = a * (2^b)
 */
public class LeftShift {

    public static void main(String[] args) {

        int a = 5;

        int result = a << 2;

        System.out.println("5 << 2 = " + result);

        /*
         * 5 = 00000101
         *
         * Shift left by 2:
         * 00010100
         *
         * Decimal = 20
         */
    }
}
