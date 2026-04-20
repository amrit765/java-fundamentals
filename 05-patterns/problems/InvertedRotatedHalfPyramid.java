// Q. Print Inverted & Rotated Half Pyramid
    //    *
    //   **
    //  ***
    // ****

    // Logic:
    // Spaces → n - i
    // Stars → i
    // First print spaces, then stars
    

public class InvertedRotatedHalfPyramid {

    public static void inverted_rotated_half_pyramid(int n) {

        // outer loop
        for(int i=1; i<=n; i++) {

            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        //hollow_rectangle(10, 7);
        inverted_rotated_half_pyramid(4);
    }
}
