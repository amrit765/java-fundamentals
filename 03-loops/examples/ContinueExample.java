// Demonstrates continue statement

public class ContinueExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue; // skips this iteration
            }

            System.out.println(i);
        }
    }
}