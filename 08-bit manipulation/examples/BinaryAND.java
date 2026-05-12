/**
 * Demonstrates Binary AND (&) operator
 *
 * Rule:
 * 1 & 1 = 1
 * Otherwise = 0
 */
public class BinaryAND {

    public static void main(String[] args) {

        int a = 5; // 0101
        int b = 6; // 0110

        int result = a & b;

        System.out.println("5 & 6 = " + result);

        /*
         * 0101
         * 0110
         * ----
         * 0100 = 4
         */
    }
}