// Demonstrates break statement

public class BreakExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                break; // exits loop immediately
            }

            System.out.println(i);
        }

        System.out.println("Out of loop");
    }
}