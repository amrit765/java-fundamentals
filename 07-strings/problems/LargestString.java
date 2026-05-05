/**
 * Problem:
 * Given an array of strings, find the largest string
 * based on lexicographic (dictionary) order.
 */
public class LargestString {

    public static String findLargest(String[] arr) {

        // Assume first string is largest
        String largest = arr[0];

        // Traverse array
        for (int i = 1; i < arr.length; i++) {

            /*
             * compareTo logic:
             * If largest < arr[i] → update largest
             */
            if (largest.compareTo(arr[i]) < 0) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        String[] fruits = {"apple", "mango", "banana"};

        String result = findLargest(fruits);

        System.out.println("Largest string: " + result);
    }
}
