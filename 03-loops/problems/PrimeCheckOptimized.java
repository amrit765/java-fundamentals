// Problem: Check if number is prime (optimized to sqrt(n))

import java.util.Scanner;

public class PrimeCheckOptimized {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Not prime");
            return;
        }

        if (n == 2) {
            System.out.println("Prime");
            return;
        }

        boolean isPrime = true;

        // Only check till sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }

        sc.close();
    }
}