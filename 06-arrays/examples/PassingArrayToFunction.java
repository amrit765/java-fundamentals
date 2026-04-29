// Example: Passing array to function (Call by Reference behavior)

public class PassingArrayToFunction {

    // Function to update array values
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1; // increment each element
        }
    }

    public static void main(String[] args) {

        int marks[] = {97, 98, 99};

        // Passing array to function
        update(marks);

        // Printing updated array
        System.out.println("Updated Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}