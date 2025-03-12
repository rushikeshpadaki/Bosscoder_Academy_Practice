import java.util.Scanner;

/**
 * Title: Quadratic Time Complexity Example
 * Author: Rushikesh Padaki
 * Date: 12 March 2025
 *
 * Description:
 * This program demonstrates an example of quadratic time complexity (O(n²)).
 * - It sorts an array using the Bubble Sort algorithm.
 * - Bubble Sort compares adjacent elements and swaps them if they are in the wrong order.
 * - The algorithm has a time complexity of O(n²) due to the nested loop structure.
 *
 * Algorithm:
 * 1. Take array size and elements from the user.
 * 2. Display the array elements before sorting.
 * 3. Apply the Bubble Sort algorithm to sort the array.
 * 4. Display the array elements after sorting.
 *
 * Time Complexity:
 * - O(n²) — Quadratic time complexity.
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

public class QuadraticTimeComplexity {

    /**
     * Sorts an array using the Bubble Sort algorithm.
     * @param input The input array to be sorted
     * @return The sorted array
     */
    static int[] bubbleSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements of an array: ");
        int n = sc.nextInt();

        int[] input = new int[n];
        System.out.print("Enter " + n + " elements of the array: ");
        for (int i = 0; i < n; i++)
            input[i] = sc.nextInt();

        // Display array elements before sorting
        System.out.println("Array Elements Before Sorting:");
        for (int i : input)
            System.out.print(i + " ");
        System.out.println();

        int[] output = bubbleSort(input);

        // Display array elements after sorting
        System.out.println("Array Elements After Sorting:");
        for (int o : output)
            System.out.print(o + " ");
        System.out.println();

        sc.close();
    }
}