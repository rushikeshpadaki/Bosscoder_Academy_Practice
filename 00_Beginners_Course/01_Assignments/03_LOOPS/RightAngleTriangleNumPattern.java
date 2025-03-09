/**
 * Title: Right Angled Triangle Number Pattern
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program prints a right-angled triangle number pattern.
 * - The pattern consists of increasing numbers from 1 to row number.
 * - Directly prints output without storing in memory to maintain O(1) space.
 *
 * Algorithm:
 * 1. Take an integer input `n` from the user.
 * 2. If `n <= 0`, display an error message and exit.
 * 3. Use nested loops to generate the pattern:
 *    - Outer loop runs from 1 to `n` (row number).
 *    - Inner loop prints numbers from 1 to row number.
 * 4. Print directly without extra memory usage.
 *
 * Time Complexity:
 * - O(n²) – Generating the pattern
 *
 * Space Complexity:
 * - O(1) – No extra memory used
 *
 * Sample Execution:
 *
 * Case 1: n = 4
 * Input:
 * Enter a number: 4
 * Output:
 * Right Angled Triangle Number Pattern for 4:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 *
 * Case 2: n = 0
 * Input:
 * Enter a number: 0
 * Output:
 * Invalid input! Please enter a positive number.
 *
 * Case 3: n = -3
 * Input:
 * Enter a number: -3
 * Output:
 * Invalid input! Please enter a positive number.
 */

import java.util.Scanner;

public class RightAngleTriangleNumPattern {
    /**
     * Prints a right-angled triangle number pattern.
     * @param n The number of rows in the pattern.
     */
    static void printPattern(int n) {
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive number.");
            return;
        }

        System.out.println("Right Angled Triangle Number Pattern for " + n + " :");
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

        printPattern(n);

        sc.close();
    }
}