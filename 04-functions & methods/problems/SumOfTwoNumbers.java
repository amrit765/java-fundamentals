// Problem: Find sum of two numbers using function

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = sum(a, b);

        System.out.println("Sum = " + result);

        sc.close();
    }
}