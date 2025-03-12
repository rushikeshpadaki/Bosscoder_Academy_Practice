import java.util.Scanner;

/**
 * Title: Linear Time Complexity Example
 * Author: Rushikesh Padaki
 * Date: 12 March 2025
 *
 * Description:
 * This program demonstrates an example of linear time complexity (O(n)).
 * - It implements a linear search algorithm to search for an element in an array.
 * - The algorithm scans each element of the array sequentially until the target is found or the array ends.
 *
 * Algorithm:
 * 1. Take array size and elements from the user.
 * 2. Take the target element to be searched.
 * 3. Apply linear search to find the target.
 * 4. If the element is found, return its index; otherwise, return -1.
 *
 * Time Complexity:
 * - O(n) — Linear time complexity.
 *
 * Space Complexity:
 * - O(1) — Constant extra space used.
 *
 * Sample Execution:
 *
 * Case 1: Searching for an element present in the array
 * Input:
 * Enter the number of elements of an array: 5
 * Enter 5 elements of the array: 1 2 3 4 5
 * Enter a value to be searched in array: 3
 * Output:
 * The element 3 is found at the index 2 in the array!
 *
 * Case 2: Searching for an element not present in the array
 * Input:
 * Enter the number of elements of an array: 5
 * Enter 5 elements of the array: 1 2 3 4 5
 * Enter a value to be searched in array: 6
 * Output:
 * The element 6 is not the part of the array!
 */

public class LinearTimeComplexity {

    /**
     * Performs linear search on an array.
     * @param arr The array to search
     * @param target The value to search for
     * @return The index of the target if found, otherwise -1
     */
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements of the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter a value to be searched in array: ");
        int target = sc.nextInt();

        int index = linearSearch(arr, target);
        if (index == -1)
            System.out.println("The element " + target + " is not the part of the array!");
        else
            System.out.println("The element " + target + " is found at the index " + index + " in the array!");

        sc.close();
    }
}