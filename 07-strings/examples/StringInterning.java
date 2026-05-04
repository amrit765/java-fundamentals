/**
 * Demonstrates:
 * - String pool (interning)
 * - Difference between == and equals()
 * - Heap vs String pool behavior
 */
public class StringInterning {

    public static void main(String[] args) {

        // Stored in String pool
        String s1 = "Tony";
        String s2 = "Tony";

        // Created in heap (new object)
        String s3 = new String("Tony");

        // Reference comparison (memory address)
        System.out.println("s1 == s2: " + (s1 == s2)); // true (same pool reference)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (different objects)

        // Value comparison (content)
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true

        /*
         * Key Concept:
         * - String literals use String pool (memory optimization)
         * - 'new' keyword forces new object creation in heap
         * - Always use .equals() for content comparison
         */
    }
}