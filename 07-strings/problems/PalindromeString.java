/**
 * Problem:
 * Check if a given string is a palindrome.
 *
 * A palindrome reads the same forward and backward.
 * Example: "racecar", "noon"
 */
public class PalindromeString {

    public static boolean isPalindrome(String str) {

        int n = str.length();

        // Compare characters from start and end
        for (int i = 0; i < n / 2; i++) {

            // If mismatch found → not palindrome
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }

        // If all characters matched
        return true;
    }

    public static void main(String[] args) {

        String str = "racecar";

        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }
}