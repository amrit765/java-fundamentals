// Example: Creating and initializing arrays

public class ArrayCreation {
    public static void main(String[] args) {

        // Declaration + memory allocation
        int marks[] = new int[5];

        // Initialization
        marks[0] = 90;
        marks[1] = 85;
        marks[2] = 95;
        marks[3] = 80;
        marks[4] = 75;

        // Another way: Direct initialization
        int numbers[] = {1, 2, 3, 4, 5};

        // String array
        String fruits[] = {"apple", "mango", "orange"};

        // Printing elements
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}