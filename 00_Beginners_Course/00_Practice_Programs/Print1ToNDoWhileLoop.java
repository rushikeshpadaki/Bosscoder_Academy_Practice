/**
 * Title: Print Natural Numbers from 1 to N using Do-While Loop
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program prints natural numbers from 1 to `n` using a `do-while` loop.
 * - The program reads an integer input `n` from the user.
 * - A `do-while` loop is used to iterate from 1 to `n`.
 * - In each iteration, the loop variable `i` is printed.
 * - The loop executes at least once, even if the condition is false initially.
 * - The loop terminates once `i` exceeds `n`.
 *
 * Algorithm:
 * 1. Read input `n` from user.
 * 2. Initialize loop variable `i = 1`.
 * 3. Execute the following at least once:
 *    - Print the loop variable `i`.
 *    - Increment `i` by 1.
 * 4. Repeat while `i <= n`.
 * 5. End loop when condition `i <= n` fails.
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
 * 1 (Loop executes at least once due to `do-while`)
 */

import java.util.Scanner;

public class Print1ToNDoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for n: ");
        int n = sc.nextInt();

        System.out.println("Natural Numbers from 1 to " + n + " :");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);

        sc.close();
    }
}