 // Q. Print Hollow Rhombus Pattern
    /*
            *****
           *   *
          *   *
         *   *
        *****
    */

    // Logic:
    // Same as solid rhombus for structure (spaces)
    // Inside → apply hollow rectangle logic
    // Boundary → print '*'
    // Else → print space

    
public class HollowRhombus {

    public static void hollow_rhombus(int n) {

        for(int i=1; i<=n; i++) {

            // spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            // hollow rectangle logic
            for(int j=1; j<=n; j++) {

                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_rhombus(5);
    }
}