import java.util.Scanner;

/**
 * Title: Heart Pattern
 * Author: Rushikesh Padaki
 * Date: 11 March 2025
 *
 * Description:
 * This program prints a heart pattern of `*` characters.
 * - The program reads an integer `n` from the user.
 * - The pattern consists of two parts:
 *   - Upper part → Two symmetric lobes of the heart
 *   - Lower part → A triangular base forming the tip of the heart
 * - A nested `for` loop is used to generate the pattern.
 *
 * Algorithm:
 * 1. Read input `n` from user.
 * 2. Generate the upper part of the heart:
 *    - Outer loop runs from `n/2` to `n` → Rows
 *    - First inner loop prints leading spaces
 *    - Second inner loop prints left half of the heart
 *    - Third inner loop prints middle spaces
 *    - Fourth inner loop prints right half of the heart
 * 3. Generate the lower part of the heart:
 *    - Outer loop runs from `n` to `1`
 *    - First inner loop prints leading spaces
 *    - Second inner loop prints `*` characters
 * 4. Move to the next line after printing each row.
 *
 * Time Complexity:
 * - O(n²) → Loop runs `n * (2n - 1)` times.
 *
 * Space Complexity:
 * - O(1) → Constant extra space is used.
 *
 * Sample Execution:
 *
 * Case 1: n = 6
 * Input:
 * Enter a number: 6
 * Output:
 *  ***** *****
 * ******* *******
 * ***************
 *  *************
 *   ***********
 *    *********
 *     *******
 *      *****
 *       ***
 *        *
 *
 * Case 2: n = 3
 * Input:
 * Enter a number: 3
 * Output:
 *  *** ***
 * *******
 *  *****
 *   ***
 *    *
 */

public class HeartPattern {

    /**
     * Prints a heart pattern of `*` characters.
     *
     * @param n Number of rows for the heart pattern
     */
    static void printPattern(int n) {
        // Upper part of the heart
        for (int i = n / 2; i <= n; i += 2) {
            // Print leading spaces
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            // Print left half of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print middle spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print right half of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the heart
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Heart Pattern:");
        printPattern(n);

        sc.close();
    }
}