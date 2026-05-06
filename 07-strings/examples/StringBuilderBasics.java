/**
 * Demonstrates:
 * - Why StringBuilder is used
 * - Mutable strings
 * - Converting StringBuilder to String
 */
public class StringBuilderBasics {

    public static void main(String[] args) {

        /*
         * Strings are immutable in Java.
         * Every modification creates a new object.
         *
         * StringBuilder solves this problem.
         */

        // Creating StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Modifying the string
        sb.append(" World");

        System.out.println("StringBuilder: " + sb);

        // Convert StringBuilder to String
        String result = sb.toString();

        System.out.println("Converted String: " + result);
    }
}