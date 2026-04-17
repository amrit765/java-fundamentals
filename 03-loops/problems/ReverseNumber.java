// Problem: Reverse a number

public class ReverseNumber {

    public static void main(String[] args) {

        int n = 12345;
        int rev = 0;

        while (n > 0) {

            int lastDigit = n % 10;

            // shift previous digits and add new digit
            rev = rev * 10 + lastDigit;

            n = n / 10;
        }

        System.out.println("Reversed = " + rev);
    }
}