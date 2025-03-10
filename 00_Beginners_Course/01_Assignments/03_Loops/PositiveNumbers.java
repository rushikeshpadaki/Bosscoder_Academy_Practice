/**
 * Title: Count Positive Numbers in a List
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program counts the number of positive integers in a list.
 * - The program reads a list of integers from the user.
 * - It uses the `countPositives(int[] input)` method to count the positive numbers:
 *   - Iterate through the list.
 *   - If the element is greater than zero, increment the count.
 * - The result is displayed to the user.
 *
 * Algorithm:
 * 1. Read the size of the list from the user.
 * 2. Read `size` elements into an array.
 * 3. Call the `countPositives()` function:
 *    - Initialize count = 0.
 *    - For each element in the array:
 *      - If element > 0, increment count.
 *    - Return the count.
 * 4. Print the result.
 *
 * Time Complexity:
 * - O(n) → n elements are processed once.
 *
 * Space Complexity:
 * - O(n) → Space for storing the input array.
 *
 * Sample Execution:
 *
 * Case 1: Normal case
 * Input:
 * Enter the number of elements of the list: 5
 * Enter 5 elements of the list: 2 -3 4 -5 6
 * Output:
 * Number of positive integers in the list = 3
 *
 * Case 2: All positive numbers
 * Input:
 * Enter the number of elements of the list: 4
 * Enter 4 elements of the list: 1 2 3 4
 * Output:
 * Number of positive integers in the list = 4
 *
 * Case 3: All negative numbers
 * Input:
 * Enter the number of elements of the list: 3
 * Enter 3 elements of the list: -2 -5 -8
 * Output:
 * Number of positive integers in the list = 0
 *
 * Case 4: Mixed positive and zero values
 * Input:
 * Enter the number of elements of the list: 4
 * Enter 4 elements of the list: 0 1 2 0
 * Output:
 * Number of positive integers in the list = 2
 */

import java.util.Scanner;

public class PositiveNumbers {

    /**
     * Counts the number of positive integers in the list.
     * @param input The input array of integers.
     * @return The count of positive integers.
     */
    static int countPositives(int[] input) {
        int count = 0;
        for (int i : input) {
            if (i > 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements of the list: ");
        int size = sc.nextInt();

        System.out.print("Enter " + size + " elements of the list: ");
        int[] input = new int[size];
        for (int i = 0; i < size; i++)
            input[i] = sc.nextInt();

        System.out.println("Number of positive integers in the list = " + countPositives(input));

        sc.close();
    }
}