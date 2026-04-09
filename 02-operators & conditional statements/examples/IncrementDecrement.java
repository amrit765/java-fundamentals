//Demonstration of Increment and Decrement
//They both operate on the similar basis

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;

        int b = ++a; // pre-increment
        System.out.println(a); // 11
        System.out.println(b); // 11

        int c = a++; // post-increment
        System.out.println(a); // 12
        System.out.println(c); // 11
    }
}
