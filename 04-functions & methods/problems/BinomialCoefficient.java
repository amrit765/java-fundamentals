// Problem: Calculate nCr using factorial

public class BinomialCoefficient {

    // Reusable factorial function
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    // nCr calculation
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);              //calling the factorial function
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int result = fact_n / (fact_r * fact_nmr);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2)); // Output: 10
    }
}