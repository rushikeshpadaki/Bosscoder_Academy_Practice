/**
 * Title: Multiple of Three Checker
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program checks whether a given integer is a multiple of 3.
 * - It takes an integer input from the user.
 * - It determines whether the number is a multiple of 3 using a helper function.
 * - It prints the result accordingly.
 *
 * Algorithm:
 * 1. Prompt the user to enter a number.
 * 2. Read the integer input.
 * 3. Call the `isMultipleOfThree(int num)` function:
 *    - Returns `true` if `num` is divisible by 3 (`num % 3 == 0`).
 *    - Returns `false` otherwise.
 * 4. Print whether the number "is a multiple of 3." or "is not a multiple of 3."
 *
 * Time Complexity:
 * - O(1) (Constant time) as only a single modulus operation is performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a single integer variable is used.
 *
 * Sample Execution:
 *
 * Case 1: Number is a multiple of 3
 * Input:
 * Enter a number: 9
 * Output:
 * The number 9 is a multiple of 3.
 *
 * Case 2: Number is not a multiple of 3
 * Input:
 * Enter a number: 8
 * Output:
 * The number 8 is not a multiple of 3.
 *
 * Case 3: Edge case - Zero
 * Input:
 * Enter a number: 0
 * Output:
 * The number 0 is a multiple of 3.
 *
 * Case 4: Negative number that is a multiple of 3
 * Input:
 * Enter a number: -12
 * Output:
 * The number -12 is a multiple of 3.
 *
 * Case 5: Negative number that is not a multiple of 3
 * Input:
 * Enter a number: -10
 * Output:
 * The number -10 is not a multiple of 3.
 */

import java.util.Scanner;

public class MultipleOfThree {
    /**
     * Checks if a number is a multiple of 3.
     * @param num The input number.
     * @return true if the number is a multiple of 3, false otherwise.
     */
    static boolean isMultipleOfThree(int num) {
        return (num % 3 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isMultipleOfThree(num))
            System.out.println("The number " + num + " is a multiple of 3.");
        else
            System.out.println("The number " + num + " is not a multiple of 3.");

        sc.close();
    }
}