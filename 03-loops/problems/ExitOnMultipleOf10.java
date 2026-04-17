// Problem: Exit when user enters multiple of 10

import java.util.Scanner;

public class ExitOnMultipleOf10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n % 10 == 0) {
                break; // exit loop
            }

            System.out.println(n);
        }

        sc.close();
    }
}