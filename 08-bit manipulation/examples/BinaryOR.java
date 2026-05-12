/**
 * Demonstrates Binary OR (|) operator
 *
 * Rule:
 * If at least one bit is 1 → result is 1
 */
public class BinaryOR {

    public static void main(String[] args) {

        int a = 5; // 0101
        int b = 6; // 0110

        int result = a | b;

        System.out.println("5 | 6 = " + result);

        /*
         * 0101
         * 0110
         * ----
         * 0111 = 7
         */
    }
}