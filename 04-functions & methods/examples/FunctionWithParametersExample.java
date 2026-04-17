// Example: Function with parameters and return value

import java.util.Scanner;

public class FunctionWithParametersExample {

    // Function to calculate sum
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum; // returning result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Function call with arguments
        int result = calculateSum(a, b);

        System.out.println("Sum = " + result);

        sc.close();
    }
}