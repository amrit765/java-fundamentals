/*
 * Importing Scanner class
 * from java.util package
 */
import java.util.Scanner;

public class BuiltInPackageDemo {

    public static void main(String[] args) {

        /*
         * Scanner object creation
         */
        Scanner sc = new Scanner(System.in);

        /*
         * Taking integer input
         */
        System.out.print("Enter a number: ");

        int a = sc.nextInt();

        System.out.println("You entered: " + a);

        sc.close();
    }
}