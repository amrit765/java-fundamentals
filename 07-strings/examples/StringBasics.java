import java.util.Scanner;

/**
 * Demonstrates:
 * - String declaration
 * - Taking input
 * - String length
 * - Difference between next() and nextLine()
 */
public class StringBasics {
    public static void main(String[] args) {

        // 1. Different ways to declare strings
        String str1 = "abcd";                 // Direct assignment
        String str2 = new String("xyz");      // Using constructor

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Taking input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Takes full line including spaces

        System.out.println("Hello, " + name);

        // 3. String length
        String fullName = "Tony Stark";
        System.out.println("Length of fullName: " + fullName.length());

        /*
         * NOTE:
         * - In Strings → length() is a method
         * - In Arrays → length is a property
         */

        sc.close();
    }
}