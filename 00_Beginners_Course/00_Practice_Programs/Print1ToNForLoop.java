/**
 * Title: Print Natural Numbers from 1 to N using For Loop
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program prints natural numbers from 1 to `n` using a `for` loop.
 * - The program reads an integer input `n` from the user.
 * - A `for` loop is used to iterate from 1 to `n`.
 * - In each iteration, the loop variable `i` is printed.
 * - The loop terminates once `i` exceeds `n`.
 *
 * Algorithm:
 * 1. Read input `n` from user.
 * 2. Use a `for` loop starting from 1 to `n`.
 * 3. In each iteration:
 *    - Print the loop variable `i`.
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

public class Print1ToNForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for n: ");
        int n = sc.nextInt();

        System.out.println("Natural Numbers from 1 to " + n + " :");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}