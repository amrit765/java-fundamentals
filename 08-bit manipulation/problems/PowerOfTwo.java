/**
 * Problem:
 * Check whether a number is power of 2
 *
 * Property:
 * n & (n - 1) == 0
 */
public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(8)); // true
        System.out.println(isPowerOfTwo(10)); // false
    }
}