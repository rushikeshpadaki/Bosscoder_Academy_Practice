/**
 * Title: Multiples of Five Printer
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program prints the multiples of 5 between 1 and `n`.
 * - The program reads an integer input `n` from the user.
 * - It uses a `for` loop to iterate through numbers from 1 to `n`.
 * - If the current number is divisible by 5 (`i % 5 == 0`), it is printed.
 *
 * Algorithm:
 * 1. Read input `n` from the user.
 * 2. Use a `for` loop to iterate from 1 to `n`:
 *    - If `i % 5 == 0`, print `i`.
 * 3. Continue until the loop reaches `n`.
 *
 * Time Complexity:
 * - O(n) → The loop runs `n` times.
 *
 * Space Complexity:
 * - O(1) → Constant extra space used for loop variables.
 *
 * Sample Execution:
 *
 * Case 1: Normal case
 * Input:
 * Enter a number: 20
 * Output:
 * Multiples of 5 between 1 and 20: 5 10 15 20
 *
 * Case 2: Edge case - No multiples of 5
 * Input:
 * Enter a number: 4
 * Output:
 * Multiples of 5 between 1 and 4:
 *
 * Case 3: Edge case - Minimum input
 * Input:
 * Enter a number: 5
 * Output:
 * Multiples of 5 between 1 and 5: 5
 */

import java.util.Scanner;

public class MultipleOfFive {

    /**
     * Prints multiples of 5 between 1 and `n`.
     * @param n The upper limit for finding multiples of 5.
     */
    static void printMultiplesOfFive(int n) {
        System.out.print("Multiples of 5 between 1 and " + n + " : ");
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printMultiplesOfFive(n);

        sc.close();
    }
}