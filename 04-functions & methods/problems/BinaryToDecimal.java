// Problem: Convert binary to decimal

public class BinaryToDecimal {

    public static void binaryToDecimal(int n) {

        int decimal = 0;
        int pow = 0;
        int original = n;

        while (n > 0) {
            int lastDigit = n % 10;

            decimal = decimal + lastDigit * (int)Math.pow(2, pow);

            pow++;
            n = n / 10;
        }

        System.out.println("Decimal of " + original + " = " + decimal);
    }

    public static void main(String[] args) {
        binaryToDecimal(101); // Output: 5
    }
}