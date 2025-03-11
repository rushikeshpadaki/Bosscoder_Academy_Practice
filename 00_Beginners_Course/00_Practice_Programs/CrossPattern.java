import java.util.Scanner;

/**
 * Title: Cross Pattern
 * Author: Rushikesh Padaki
 * Date: 11 March 2025
 *
 * Description:
 * This program prints a cross pattern of `*` characters.
 * - The pattern is symmetric along both diagonals.
 * - The program reads an integer `n` from the user.
 * - A nested `for` loop is used to generate the pattern.
 *
 * Algorithm:
 * 1. Read input `n` from the user.
 * 2. Outer loop runs from `1` to `n` → Controls rows
 * 3. Inner loop runs from `1` to `n` → Controls columns
 *    - If row index equals column index OR sum of row and column index equals `n + 1` → Print `*`
 *    - Else → Print space
 * 4. Move to the next line after printing each row.
 *
 * Time Complexity:
 * - O(n²) → Loop runs `n * n` times.
 *
 * Space Complexity:
 * - O(1) → Constant extra space is used.
 *
 * Sample Execution:
 *
 * Case 1: n = 5
 * Input:
 * Enter a number: 5
 * Output:
 * *   *
 *  * *
 *   *
 *  * *
 * *   *
 *
 * Case 2: n = 3
 * Input:
 * Enter a number: 3
 * Output:
 * * *
 *  *
 * * *
 */

public class CrossPattern {

    /**
     * Prints a cross pattern of `*` characters.
     *
     * @param n Number of rows and columns for the cross pattern
     */
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= n; j++) { // Loop for columns
                if (i == j || (i + j == n + 1)) // Condition for cross pattern
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Cross Pattern:");
        printPattern(n);

        sc.close();
    }
}