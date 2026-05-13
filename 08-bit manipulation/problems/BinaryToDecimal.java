/**
 * Converts binary number to decimal
 */
public class BinaryToDecimal {

    public static int binaryToDecimal(int binaryNum) {

        int decimal = 0;

        int power = 0;

        while (binaryNum > 0) {

            int lastDigit = binaryNum % 10;

            decimal = decimal + (lastDigit * (int)Math.pow(2, power));

            power++;

            binaryNum = binaryNum / 10;
        }

        return decimal;
    }

    public static void main(String[] args) {

        int result = binaryToDecimal(101);

        System.out.println("Decimal: " + result);
    }
}