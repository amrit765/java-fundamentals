// Problem: Find largest of three numbers

public class LargestOfThree {

    public static void main(String[] args) {

        int A = 1, B = 3, C = 6;

        if (A >= B && A >= C) {
            System.out.println("A is largest");
        } else if (B >= C) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }
    }
}
