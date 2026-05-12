/**
 * Demonstrates Right Shift (>>)
 *
 * Formula:
 * a >> b = a / (2^b)
 */
public class RightShift {

    public static void main(String[] args) {

        int a = 6;

        int result = a >> 1;

        System.out.println("6 >> 1 = " + result);

        /*
         * 6 = 00000110
         *
         * Shift right by 1:
         * 00000011
         *
         * Decimal = 3
         */
    }
}