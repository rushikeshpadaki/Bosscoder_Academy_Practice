import java.util.Scanner;

/**
 * Title: Inverted Left Triangle Pattern
 * Author: Rushikesh Padaki
 * Date: 11 March 2025
 *
 * Description:
 * This program prints an inverted left-aligned triangle pattern of `*` characters.
 * - The program reads an integer `n` from the user.
 * - A nested `for` loop is used to generate the pattern.
 * - The outer loop starts from `n` and decreases to `1`.
 * - The first inner loop prints spaces to create left alignment.
 * - The second inner loop prints `*` characters based on the row index.
 *
 * Algorithm:
 * 1. Read input `n` from user.
 * 2. Use a nested `for` loop:
 *    - Outer loop runs from `n` to `1` → Rows
 *    - First inner loop prints spaces → `(n - i)` spaces
 *    - Second inner loop prints `*` characters → `i` times
 * 3. Move to the next line after printing each row.
 * 4. Repeat until the pattern is complete.
 *
 * Time Complexity:
 * - O(n²) → Loop runs `n * (n + 1) / 2` times.
 *
 * Space Complexity:
 * - O(1) → Constant extra space is used.
 *
 * Sample Execution:
 *
 * Case 1: n = 4
 * Input:
 * Enter a number: 4
 * Output:
 * ****
 *  ***
 *   **
 *    *
 *
 * Case 2: n = 1
 * Input:
 * Enter a number: 1
 * Output:
 * *
 */

public class InvertedLeftTrianglePattern {

    /**
     * Prints an inverted left-aligned triangle pattern of `*` characters.
     *
     * @param n Number of rows for the pattern
     */
    static void printPattern(int n) {
        for (int i = n; i >= 1; i--) { // Loop for rows
            for (int j = 1; j <= (n - i); j++) { // Print spaces for left alignment
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // Print '*' characters
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Inverted Left Triangle Pattern:");
        printPattern(n);

        sc.close();
    }
}