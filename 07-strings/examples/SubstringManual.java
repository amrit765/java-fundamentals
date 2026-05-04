/**
 * Custom implementation of substring function
 */
public class SubstringManual {

    public static String substring(String str, int start, int end) {

        String result = "";

        // Build substring manually
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        String str = "HelloWorld";

        System.out.println(substring(str, 0, 5)); // Hello
    }
}