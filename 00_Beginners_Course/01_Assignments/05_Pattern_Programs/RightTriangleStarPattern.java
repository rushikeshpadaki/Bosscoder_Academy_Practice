import java.util.Scanner;

/**
 * Title: Right Angled Triangle Star Pattern Generator
 * Author: Rushikesh Padaki
 * Date: 09 March 2025
 *
 * Description:
 * This program generates a right-angled triangle star pattern of size `n`.
 * - The first row contains 1 star, the second row contains 2 stars, and so on.
 * - The triangle is right-aligned with stars increasing row by row.
 *
 * Algorithm:
 * 1. Read the size of the triangle from the user.
 * 2. Use nested loops to print increasing numbers of stars in each row.
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
 * Case 1: Generate a right-angled triangle star pattern of size 3
 * Input:
 * Enter a number: 3
 * Output:
 * Right Angled Triangle Star Pattern
 * *
 * * *
 * * * *
 *
 * Case 2: Generate a right-angled triangle star pattern of size 5
 * Input:
 * Enter a number: 5
 * Output:
 * Right Angled Triangle Star Pattern
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

public class RightTriangleStarPattern {

    /**
     * Prints a right-angled triangle star pattern of size `n`.
     *
     * @param n The size of the triangle pattern.
     */
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Right Angled Triangle Star Pattern");
        printPattern(n);

        sc.close();
    }
}