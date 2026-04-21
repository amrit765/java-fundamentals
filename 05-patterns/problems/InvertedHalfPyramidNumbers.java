// Q. Print Inverted Half Pyramid with Numbers
    // 1234
    // 123
    // 12
    // 1

    // Logic:
    // Numbers decrease with each row
    // For each row → print numbers from 1 to (n - i + 1)


    public class InvertedHalfPyramidNumbers {

    public static void inverted_half_pyramid_withNumbers(int n) {

        for(int i=1; i<=n; i++) {

            // inner - numbers
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted_half_pyramid_withNumbers(5);
    }
}