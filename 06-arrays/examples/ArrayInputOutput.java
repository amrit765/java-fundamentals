import java.util.Scanner;

// Example: Taking input and printing array elements

public class ArrayInputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[3];

        // Taking input
        System.out.println("Enter 3 marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // Output
        System.out.println("Entered Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }

        sc.close();
    }
}