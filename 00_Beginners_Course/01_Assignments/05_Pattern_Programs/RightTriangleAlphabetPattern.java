import java.util.Scanner;

/**
 * Title: Right Angled Triangle Alphabet Pattern Generator
 * Author: Rushikesh Padaki
 * Date: 09 March 2025
 *
 * Description:
 * This program generates a right-angled triangle alphabet pattern of size `n`.
 * - The first row starts with 'a'.
 * - Each row contains increasing alphabets in ascending order.
 *
 * Algorithm:
 * 1. Read the size of the triangle from the user.
 * 2. Use nested loops to print increasing alphabets in each row.
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
 * Case 1: Generate a right-angled triangle alphabet pattern of size 3
 * Input:
 * Enter a number: 3
 * Output:
 * Right Angled Triangle Alphabet Pattern
 * a
 * a b
 * a b c
 *
 * Case 2: Generate a right-angled triangle alphabet pattern of size 5
 * Input:
 * Enter a number: 5
 * Output:
 * Right Angled Triangle Alphabet Pattern
 * a
 * a b
 * a b c
 * a b c d
 * a b c d e
 */

public class RightTriangleAlphabetPattern {

    /**
     * Prints a right-angled triangle alphabet pattern of size `n`.
     *
     * @param n The size of the triangle pattern.
     */
    static void printPattern(int n) {
        for (char i = 'a'; i <= ('a' + n - 1); i++) {
            for (char j = 'a'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Right Angled Triangle Alphabet Pattern");
        printPattern(n);

        sc.close();
    }
}