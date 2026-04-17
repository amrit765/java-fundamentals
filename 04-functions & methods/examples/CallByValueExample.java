// Example: Demonstrating call by value in Java

public class CallByValueExample {

    // Swap function (won't affect original values)
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside swap:");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swap(a, b);

        // Values remain unchanged
        System.out.println("After swap:");
        System.out.println("a = " + a + ", b = " + b);
    }
}