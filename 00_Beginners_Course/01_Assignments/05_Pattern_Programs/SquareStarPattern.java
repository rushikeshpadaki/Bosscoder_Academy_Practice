import java.util.Scanner;

/**
 * Title: Square Star Pattern Generator
 * Author: Rushikesh Padaki
 * Date: 09 March 2025
 *
 * Description:
 * This program generates a square star pattern of size `n x n`.
 * - Each row contains `n` stars.
 * - The pattern is printed as a square matrix of stars.
 *
 * Algorithm:
 * 1. Read the size of the square from the user.
 * 2. Use nested loops to print `n` rows and `n` columns of stars.
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
 * Case 1: Generate a square star pattern of size 3
 * Input:
 * Enter a number: 3
 * Output:
 * Square Star Pattern
 * * * *
 * * * *
 * * * *
 *
 * Case 2: Generate a square star pattern of size 5
 * Input:
 * Enter a number: 5
 * Output:
 * Square Star Pattern
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */

public class SquareStarPattern {

    /**
     * Prints a square star pattern of size `n x n`.
     *
     * @param n The size of the square pattern.
     */
    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Square Star Pattern");
        printPattern(n);

        sc.close();
    }
}