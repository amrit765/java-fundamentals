// Q. Print Floyd's Triangle
// 1
// 2 3
// 4 5 6
// 7 8 9 10

// Logic:
// Use a counter variable
// Print and increment continuously across rows


public class FloydsTriangle {

    public static void floyds_triangle(int n) {

        int counter = 1;

        for(int i=1; i<=n; i++) {

            // how many times counter will be printed
            for(int j=1; j<=i; j++) {
                System.out.print(counter + " ");
                counter++;
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        floyds_triangle(5);
    }
}