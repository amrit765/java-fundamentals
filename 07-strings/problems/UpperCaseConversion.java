/**
 * Converts first letter of each word to uppercase
 *
 * Example:
 * "hi, i am amrit"
 * ->
 * "Hi, I Am Amrit"
 */
public class UpperCaseConversion {

    public static String toUpperCase(String str) {

        // StringBuilder for efficient string modification
        StringBuilder sb = new StringBuilder("");

        // Convert first character to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Traverse remaining string
        for (int i = 1; i < str.length(); i++) {

            // Check for spaces
            if (str.charAt(i) == ' ' && i < str.length() - 1) {

                // Append space
                sb.append(str.charAt(i));

                i++;

                // Convert next character to uppercase
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {

                // Append normal characters
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "hi, i am amrit";

        String result = toUpperCase(str);

        System.out.println(result);
    }
}