// Example: Function Overloading

public class FunctionOverloadingExample {

    // Sum of 2 integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Sum of 3 integers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Sum of floats
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(sum(4, 5));        // 2 params
        System.out.println(sum(4, 3, 2));     // 3 params
        System.out.println(sum(4.2f, 4.8f));  // float version
    }
}