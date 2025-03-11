import java.util.Scanner;

/**
 * Title: Square Pattern
 * Author: Rushikesh Padaki
 * Date: 11 March 2025
 *
 * Description:
 * This program prints a square pattern of `*` characters of size `n x n`.
 * - The program reads an integer `n` from the user.
 * - A nested `for` loop is used to generate the square pattern.
 * - The outer loop controls the rows, and the inner loop controls the columns.
 *
 * Algorithm:
 * 1. Read input `n` from user.
 * 2. Use a nested `for` loop:
 *    - Outer loop runs from `1` to `n` → Rows
 *    - Inner loop runs from `1` to `n` → Columns
 *    - Print `*` for each column
 * 3. Move to the next line after printing each row.
 * 4. Repeat until the pattern is complete.
 *
 * Time Complexity:
 * - O(n²) → Loop runs `n * n` times.
 *
 * Space Complexity:
 * - O(1) → Constant extra space is used.
 *
 * Sample Execution:
 *
 * Case 1: n = 3
 * Input:
 * Enter a number: 3
 * Output:
 * * * *
 * * * *
 * * * *
 *
 * Case 2: n = 1
 * Input:
 * Enter a number: 1
 * Output:
 * *
 */

public class SquarePattern {

    /**
     * Prints a square pattern of `*` characters of size `n x n`.
     *
     * @param n Size of the square pattern
     */
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= n; j++) { // Loop for columns
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Square Pattern:");
        printPattern(n);

        sc.close();
    }
}