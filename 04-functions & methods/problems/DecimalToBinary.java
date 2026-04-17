// Problem: Convert decimal to binary

public class DecimalToBinary {

    public static void decToBin(int n) {

        int binary = 0;
        int pow = 0;
        int original = n;

        while (n > 0) {
            int rem = n % 2;

            binary = binary + rem * (int)Math.pow(10, pow);

            pow++;
            n = n / 2;
        }

        System.out.println("Binary of " + original + " = " + binary);
    }

    public static void main(String[] args) {
        decToBin(5); // Output: 101
    }
}