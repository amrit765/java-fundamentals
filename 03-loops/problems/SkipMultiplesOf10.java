// Problem: Skip multiples of 10

import java.util.Scanner;

public class SkipMultiplesOf10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue; // skip this number
            }

            System.out.println(n);
        }
    }
}