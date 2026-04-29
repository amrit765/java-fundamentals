// Problem: Update marks of an array by adding +1

public class UpdateMarks {

    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {90, 85, 88};

        update(marks);

        System.out.println("Updated Marks:");
        for (int val : marks) {
            System.out.print(val + " ");
        }
    }
}