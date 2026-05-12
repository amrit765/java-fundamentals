/**
 * Demonstrates Binary One's Complement (~)
 *
 * Changes:
 * 1 -> 0
 * 0 -> 1
 */
public class OnesComplement {

    public static void main(String[] args) {

        int a = 5;

        int result = ~a;

        System.out.println("~5 = " + result);

        /*
         * 5  -> 00000101
         * ~5 -> 11111010
         *
         * Output = -6
         */
    }
}