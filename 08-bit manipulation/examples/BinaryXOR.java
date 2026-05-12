/**
 * Demonstrates Binary XOR (^) operator
 *
 * Rule:
 * Same bits   -> 0
 * Different bits -> 1
 */
public class BinaryXOR {

    public static void main(String[] args) {

        int a = 5; // 0101
        int b = 6; // 0110

        int result = a ^ b;

        System.out.println("5 ^ 6 = " + result);

        /*
         * 0101
         * 0110
         * ----
         * 0011 = 3
         */
    }
}