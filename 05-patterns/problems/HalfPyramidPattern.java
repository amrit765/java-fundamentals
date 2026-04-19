// Q. Print Half Pyramid Pattern
        // 1
        // 12
        // 123
        // 1234

        // Logic:
        // Numbers increase from 1 to current line number

public class HalfPyramidPattern {
    public static void main(String args[]) {

        int n = 4;

        for(int line=1; line<=n; line++) {
            // numbers print
            for(int number=1; number<=line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}