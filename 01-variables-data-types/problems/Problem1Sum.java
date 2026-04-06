// Problem: Find sum of two numbers
// Approach: Direct addition
// Time Complexity: O(1)

package problems;
import java.util.*;

public class Problem1Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}