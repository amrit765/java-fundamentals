/**
 * Demonstrates lexicographic comparison using compareTo()
 */
public class StringCompare {

    public static void main(String[] args) {

        String str1 = "apple";
        String str2 = "banana";

        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println("Strings are equal");
        } else if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else {
            System.out.println(str1 + " comes after " + str2);
        }

        /*
         * compareTo() returns:
         * 0  → equal
         * <0 → str1 < str2
         * >0 → str1 > str2
         */
    }
}