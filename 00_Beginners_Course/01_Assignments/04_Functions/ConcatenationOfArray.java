import java.util.Scanner;

/**
 * Title: Concatenation of Array
 * Author: Rushikesh Padaki
 * Date: 09 March 2025
 *
 * Description:
 * This program takes an array of integers as input and returns a new array
 * where the original array is concatenated with itself.
 * - The length of the output array will be twice the length of the input array.
 *
 * Algorithm:
 * 1. Read the number of elements in the input array.
 * 2. Read the elements of the array.
 * 3. Create an output array of size `2 * n`.
 * 4. Copy elements from the input array to both the first and second halves of the output array.
 * 5. Return the output array.
 *
 * Time Complexity:
 * - O(n)
 *
 * Space Complexity:
 * - O(2n)
 *
 * Sample Execution:
 *
 * Case 1: Concatenation of array with positive elements
 * Input:
 * Enter number of elements: 3
 * Enter 3 elements of the array: 1 2 3
 * Output:
 * Concatenated Array: 1 2 3 1 2 3
 *
 * Case 2: Concatenation of an array with mixed elements
 * Input:
 * Enter number of elements: 4
 * Enter 4 elements of the array: 5 -1 0 7
 * Output:
 * Concatenated Array: 5 -1 0 7 5 -1 0 7
 */

public class ConcatenationOfArray {

    /**
     * Concatenates the input array with itself.
     *
     * @param input The input array.
     * @return A new array which is the concatenation of the input array with itself.
     */
    static int[] concat(int[] input) {
        int[] output = new int[input.length * 2];

        for (int i = 0; i < input.length; i++) {
            output[i] = output[input.length + i] = input[i];
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] input = new int[n];

        System.out.print("Enter " + n + " elements of the array: ");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        int[] output = concat(input);

        System.out.print("Concatenated Array: ");
        for (int j : output) {
            System.out.print(j + " ");
        }

        sc.close();
    }
}