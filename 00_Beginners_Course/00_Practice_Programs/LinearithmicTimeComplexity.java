import java.util.Arrays;
import java.util.Scanner;

/**
 * Title: Linearithmic Time Complexity Example
 * Author: Rushikesh Padaki
 * Date: 12 March 2025
 *
 * Description:
 * This program demonstrates an example of linearithmic time complexity (O(n log n)).
 * - It takes an array of integers from the user and sorts it using `Arrays.sort()` method.
 * - The `Arrays.sort()` method internally uses a Dual-Pivot Quicksort algorithm for primitive types,
 *   which has an average time complexity of O(n log n).
 *
 * Algorithm:
 * 1. Take array size and elements from the user.
 * 2. Display the array elements before sorting.
 * 3. Sort the array using `Arrays.sort()` (O(n log n) complexity).
 * 4. Display the array elements after sorting.
 *
 * Time Complexity:
 * - O(n log n) — Linearithmic time complexity.
 *
 * Space Complexity:
 * - O(1) — Constant extra space used.
 *
 * Sample Execution:
 *
 * Case 1: Sorting an unsorted array
 * Input:
 * Enter the number of elements of an array: 5
 * Enter 5 elements of the array: 5 3 1 4 2
 * Output:
 * Array Elements Before Sorting:
 * 5 3 1 4 2
 * Array Elements After Sorting:
 * 1 2 3 4 5
 */

public class LinearithmicTimeComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements of the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Display array elements before sorting
        System.out.println("Array Elements Before Sorting:");
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println();

        // Sort the array (O(n log n) operation)
        Arrays.sort(arr);

        // Display array elements after sorting
        System.out.println("Array Elements After Sorting:");
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println();

        sc.close();
    }
}