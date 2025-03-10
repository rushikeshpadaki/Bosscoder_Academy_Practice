import java.util.Scanner;

/**
 * Title: Inverted Right Angled Triangle Star Pattern Generator
 * Author: Rushikesh Padaki
 * Date: 09 March 2025
 *
 * Description:
 * This program generates an inverted right-angled triangle star pattern of size `n`.
 * - The first row starts with `n` stars.
 * - Each subsequent row decreases the number of stars by one.
 *
 * Algorithm:
 * 1. Read the size of the triangle from the user.
 * 2. Use nested loops to print decreasing stars in each row.
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
 * Case 1: Generate an inverted right-angled triangle of size 4
 * Input:
 * Enter a number: 4
 * Output:
 * Inverted Right Angled Triangle Star Pattern
 * * * * *
 * * * *
 * * *
 * *
 *
 * Case 2: Generate an inverted right-angled triangle of size 3
 * Input:
 * Enter a number: 3
 * Output:
 * Inverted Right Angled Triangle Star Pattern
 * * * *
 * * *
 * *
 */

public class InvertedRightTriangleStarPattern {

    /**
     * Prints an inverted right-angled triangle star pattern of size `n`.
     *
     * @param n The size of the triangle pattern.
     */
    static void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
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

        System.out.println("Inverted Right Angled Triangle Star Pattern");
        printPattern(n);

        sc.close();
    }
}