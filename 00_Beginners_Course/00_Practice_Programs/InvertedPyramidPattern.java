import java.util.Scanner;

/**
 * Title: Inverted Pyramid Pattern
 * Author: Rushikesh Padaki
 * Date: 11 March 2025
 *
 * Description:
 * This program prints an inverted pyramid pattern of `*` characters.
 * - The program reads an integer `n` from the user.
 * - A nested `for` loop is used to generate the pattern.
 * - The first inner loop prints spaces for centering the pattern.
 * - The second inner loop prints `*` characters in a decreasing order.
 *
 * Algorithm:
 * 1. Read input `n` from user.
 * 2. Use a nested `for` loop:
 *    - Outer loop runs from `n` to `1` → Rows
 *    - First inner loop prints `(n - i)` spaces for centering
 *    - Second inner loop prints `(2 * i - 1)` `*` characters
 * 3. Move to the next line after printing each row.
 * 4. Repeat until the pattern is complete.
 *
 * Time Complexity:
 * - O(n²) → Loop runs `n * (2n - 1) / 2` times.
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
 * *******
 *  *****
 *   ***
 *    *
 *
 * Case 2: n = 1
 * Input:
 * Enter a number: 1
 * Output:
 * *
 */

public class InvertedPyramidPattern {

    /**
     * Prints an inverted pyramid pattern of `*` characters.
     *
     * @param n Number of rows for the pattern
     */
    static void printPattern(int n) {
        for (int i = n; i >= 1; i--) { // Loop for rows
            for (int j = 1; j <= (n - i); j++) // Print spaces for centering
                System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) // Print '*' characters
                System.out.print("*");
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Inverted Pyramid Pattern:");
        printPattern(n);

        sc.close();
    }
}