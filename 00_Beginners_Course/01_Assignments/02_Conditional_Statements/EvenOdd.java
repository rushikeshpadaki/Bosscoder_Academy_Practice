/**
 * Title: Even or Odd Number Checker
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program checks whether a given integer is even or odd.
 * - It takes an integer input from the user.
 * - It determines whether the number is even or odd using a helper function.
 * - It prints the result accordingly.
 *
 * Algorithm:
 * 1. Prompt the user to enter a number.
 * 2. Read the integer input.
 * 3. Call the `isEven(int num)` function:
 *    - Returns `true` if `num` is divisible by 2 (even).
 *    - Returns `false` otherwise (odd).
 * 4. Print whether the number is "even!" or "odd!".
 *
 * Time Complexity:
 * - O(1) (Constant time) as only a single modulus operation is performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a single integer variable is used.
 *
 * Sample Execution:
 *
 * Case 1: Even number
 * Input:
 * Enter a number: 8
 * Output:
 * 8 is even!
 *
 * Case 2: Odd number
 * Input:
 * Enter a number: 5
 * Output:
 * 5 is odd!
 *
 * Case 3: Edge case - Zero
 * Input:
 * Enter a number: 0
 * Output:
 * 0 is even!
 *
 * Case 4: Edge case - Negative even number
 * Input:
 * Enter a number: -10
 * Output:
 * -10 is even!
 *
 * Case 5: Edge case - Negative odd number
 * Input:
 * Enter a number: -7
 * Output:
 * -7 is odd!
 */

import java.util.Scanner;

public class EvenOdd {
    /**
     * Checks if a number is even.
     * @param num The input number.
     * @return true if the number is even, false otherwise.
     */
    static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isEven(num))
            System.out.println(num + " is even!");
        else
            System.out.println(num + " is odd!");

        sc.close();
    }
}