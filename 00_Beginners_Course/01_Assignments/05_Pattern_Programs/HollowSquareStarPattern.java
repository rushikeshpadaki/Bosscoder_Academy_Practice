import java.util.Scanner;

/**
 * Title: Hollow Square Star Pattern Generator
 * Author: Rushikesh Padaki
 * Date: 09 March 2025
 *
 * Description:
 * This program generates a hollow square star pattern of size `n`.
 * - The first and last rows are filled with stars.
 * - The first and last columns are filled with stars.
 * - The inner part of the square is left empty (filled with spaces).
 *
 * Algorithm:
 * 1. Read the size of the square from the user.
 * 2. Use nested loops to print stars at the boundary and spaces inside.
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
 * Case 1: Generate a hollow square star pattern of size 5
 * Input:
 * Enter a number: 5
 * Output:
 * Hollow Square Star Pattern
 * *****
 * *   *
 * *   *
 * *   *
 * *****
 *
 * Case 2: Generate a hollow square star pattern of size 3
 * Input:
 * Enter a number: 3
 * Output:
 * Hollow Square Star Pattern
 * ***
 * * *
 * ***
 */

public class HollowSquareStarPattern {

    /**
     * Prints a hollow square star pattern of size `n`.
     *
     * @param n The size of the square pattern.
     */
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Hollow Square Star Pattern");
        printPattern(n);

        sc.close();
    }
}