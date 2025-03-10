import java.util.Scanner;

/**
 * Title: Right Triangle Number Pattern Generator
 * Author: Rushikesh Padaki
 * Date: 09 March 2025
 *
 * Description:
 * This program generates a right-angled triangle number pattern of size `n`.
 * - The first row contains one element, the second row contains two elements, and so on.
 * - Each row contains sequential numbers starting from 1.
 *
 * Algorithm:
 * 1. Read the size of the triangle from the user.
 * 2. Use nested loops to print numbers in increasing order for each row.
 * 3. Print a newline character after each row.
 *
 * Time Complexity:
 * - O(n²)
 *
 * Space Complexity:
 * - O(1)
 *
 * Sample Execution:
 *
 * Case 1: Generate a right triangle number pattern of size 5
 * Input:
 * Enter a number: 5
 * Output:
 * Right Angled Triangle Number Pattern
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 *
 * Case 2: Generate a right triangle number pattern of size 3
 * Input:
 * Enter a number: 3
 * Output:
 * Right Angled Triangle Number Pattern
 * 1
 * 1 2
 * 1 2 3
 */

public class RightTriangleNumberPattern {

    /**
     * Prints a right-angled triangle number pattern of size `n`.
     *
     * @param n The size of the triangle pattern.
     */
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Right Angled Triangle Number Pattern");
        printPattern(n);

        sc.close();
    }
}