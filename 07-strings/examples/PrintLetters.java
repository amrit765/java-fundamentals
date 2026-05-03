/**
 * Function to print all characters of a string
 */
public class PrintLetters {

    public static void printLetters(String str) {

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

        System.out.println(); // Move to next line
    }

    public static void main(String[] args) {
        String name = "Amrit";

        printLetters(name);
    }
}