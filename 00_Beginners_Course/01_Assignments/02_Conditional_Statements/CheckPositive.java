/**
 * Title: Check Positive Number
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program checks whether a given integer is positive or not.
 * - It takes an integer input from the user.
 * - It determines whether the number is positive using a helper function.
 * - It prints the result accordingly.
 *
 * Algorithm:
 * 1. Prompt the user to enter a number.
 * 2. Read the integer input.
 * 3. Call the `isPositive(int num)` function:
 *    - Returns `true` if `num` is greater than 0.
 *    - Returns `false` otherwise.
 * 4. Print whether the number is a "positive number!" or "not a positive number!".
 *
 * Time Complexity:
 * - O(1) (Constant time) as only a single comparison operation is performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a single integer variable is used.
 *
 * Sample Execution:
 *
 * Case 1: Positive number
 * Input:
 * Enter a number: 8
 * Output:
 * The entered number is positive number!
 *
 * Case 2: Negative number
 * Input:
 * Enter a number: -5
 * Output:
 * The entered number is not a positive number!
 *
 * Case 3: Edge case - Zero
 * Input:
 * Enter a number: 0
 * Output:
 * The entered number is not a positive number!
 */

import java.util.Scanner;

public class CheckPositive {
    /**
     * Checks if a number is positive.
     * @param num The input number.
     * @return true if the number is positive, false otherwise.
     */
    static boolean isPositive(int num) {
        return (num > 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPositive(num))
            System.out.println("The entered number is positive number!");
        else
            System.out.println("The entered number is not a positive number!");

        sc.close();
    }
}