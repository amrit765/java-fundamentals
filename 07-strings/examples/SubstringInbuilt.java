/**
 * Demonstrates Java's built-in substring method
 */
public class SubstringInbuilt {

    public static void main(String[] args) {

        String str = "HelloWorld";

        // Extract substring from index 0 to 5 (excluding 5)
        String sub = str.substring(0, 5);

        System.out.println("Substring: " + sub);
    }
}