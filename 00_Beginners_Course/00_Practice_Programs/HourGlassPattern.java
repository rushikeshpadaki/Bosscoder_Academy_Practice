import java.util.Scanner;

/**
 * Title: Hour Glass Pattern
 * Author: Rushikesh Padaki
 * Date: 11 March 2025
 *
 * Description:
 * This program prints an hourglass pattern of `*` characters.
 * - The program reads an integer `n` from the user.
 * - The pattern consists of two halves:
 *   - Upper half → Inverted pyramid shape
 *   - Lower half → Pyramid shape
 * - A nested `for` loop is used to generate the pattern.
 *
 * Algorithm:
 * 1. Read input `n` from user.
 * 2. Generate the upper half of the hourglass:
 *    - Outer loop runs from `1` to `n` → Rows
 *    - First inner loop prints spaces for centering
 *    - Second inner loop prints `*` characters
 * 3. Generate the lower half of the hourglass:
 *    - Outer loop runs from `2` to `n`
 *    - First inner loop prints spaces for centering
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
 * Case 1: n = 4
 * Input:
 * Enter a number: 4
 * Output:
 * *******
 *  *****
 *   ***
 *    *
 *   ***
 *  *****
 * *******
 *
 * Case 2: n = 1
 * Input:
 * Enter a number: 1
 * Output:
 * *
 */

public class HourGlassPattern {

    /**
     * Prints an hourglass pattern of `*` characters.
     *
     * @param n Number of rows for the top half of the hourglass
     */
    static void printPattern(int n) {
        // Upper half of the hourglass
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) // Print spaces for centering
                System.out.print(" ");
            for (int k = 1; k <= (2 * (n - i) + 1); k++) // Print '*' characters
                System.out.print("*");
            System.out.println(); // Move to the next line
        }

        // Lower half of the hourglass
        for (int i = 2; i <= n; i++) {
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

        System.out.println("Hour Glass Pattern:");
        printPattern(n);

        sc.close();
    }
}