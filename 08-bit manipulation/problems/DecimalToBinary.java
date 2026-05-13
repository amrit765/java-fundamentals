/**
 * Converts decimal number to binary
 */
public class DecimalToBinary {

    public static void decimalToBinary(int n) {

        int binary[] = new int[32];

        int index = 0;

        while (n > 0) {

            binary[index] = n % 2;

            n = n / 2;

            index++;
        }

        System.out.print("Binary: ");

        // Print in reverse order
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        decimalToBinary(5);
    }
}