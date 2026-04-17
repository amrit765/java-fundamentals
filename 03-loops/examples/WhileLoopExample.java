// Demonstrates basic while loop

public class WhileLoopExample {

    public static void main(String[] args) {

        int counter = 0;

        // Loop runs while condition is true
        while (counter < 5) {
            System.out.println("Hello");
            counter++; // important to avoid infinite loop
        }
    }
}