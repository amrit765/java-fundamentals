/**
 * Problem:
 * Compress a string using character counts.
 *
 * Example:
 * "aaabbcccdd"
 * ->
 * "a3b2c3d2"
 */
public class StringCompression {

    public static String compress(String str) {

        // StringBuilder is more efficient than String concatenation
        StringBuilder newStr = new StringBuilder("");

        // Traverse string
        for (int i = 0; i < str.length(); i++) {

            int count = 1;

            /*
             * Count consecutive repeating characters
             */
            while (i < str.length() - 1 &&
                    str.charAt(i) == str.charAt(i + 1)) {

                count++;
                i++;
            }

            // Append current character
            newStr.append(str.charAt(i));

            // Append count if greater than 1
            if (count > 1) {
                newStr.append(count);
            }
        }

        return newStr.toString();
    }

    public static void main(String[] args) {

        String str = "aaabbcccdd";

        System.out.println("Compressed String: " + compress(str));
    }
}