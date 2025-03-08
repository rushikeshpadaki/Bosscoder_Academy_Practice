/**
 * Title: Print Natural Numbers from 1 to N using While Loop
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program prints natural numbers from 1 to `n` using a `while` loop.
 * - The program reads an integer input `n` from the user.
 * - A `while` loop is used to iterate from 1 to `n`.
 * - In each iteration, the loop variable `i` is printed.
 * - The loop terminates once `i` exceeds `n`.
 *
 * Algorithm:
 * 1. Read input `n` from user.
 * 2. Initialize loop variable `i = 1`.
 * 3. While `i <= n`:
 *    - Print the loop variable `i`.
 *    - Increment `i` by 1.
 * 4. End loop when condition `i <= n` fails.
 *
 * Time Complexity:
 * - O(n) → The loop executes `n` times.
 *
 * Space Complexity:
 * - O(1) → Constant extra space is used for the loop variable.
 *
 * Sample Execution:
 *
 * Case 1: Normal case
 * Input:
 * Enter a value for n: 5
 * Output:
 * Natural Numbers from 1 to 5 :
 * 1 2 3 4 5
 *
 * Case 2: Edge case - Minimum input
 * Input:
 * Enter a value for n: 1
 * Output:
 * Natural Numbers from 1 to 1 :
 * 1
 *
 * Case 3: Edge case - Zero
 * Input:
 * Enter a value for n: 0
 * Output:
 * (No output)
 */

import java.util.Scanner;

public class Print1ToNWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for n: ");
        int n = sc.nextInt();

        System.out.println("Natural Numbers from 1 to " + n + " :");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        sc.close();
    }
}