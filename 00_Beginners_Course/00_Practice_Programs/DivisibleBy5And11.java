/**
 * Title: Check Divisibility by 5 and 11
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program checks whether a given integer is divisible by both 5 and 11.
 * - It takes an integer input from the user.
 * - It checks if the number is divisible by both 5 and 11 using the modulus operator (`%`).
 * - It prints whether the number is divisible by both 5 and 11 or not.
 *
 * Algorithm:
 * 1. Prompt the user to enter an integer.
 * 2. Read the integer input.
 * 3. Check if the number is divisible by both 5 and 11:
 *    - If `num % 5 == 0` and `num % 11 == 0`, print "Number is divisible by 5 and 11".
 *    - Otherwise, print "Number is not divisible by 5 and 11".
 *
 * Time Complexity:
 * - O(1) (Constant time) since only two modulus operations and one conditional check are performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a single integer variable is used.
 *
 * Sample Execution:
 *
 * Case 1: Number is divisible by both 5 and 11
 * Input:
 * Enter any number: 55
 * Output:
 * Number is divisible by 5 and 11
 *
 * Case 2: Number is divisible by 5 but not by 11
 * Input:
 * Enter any number: 25
 * Output:
 * Number is not divisible by 5 and 11
 *
 * Case 3: Number is divisible by 11 but not by 5
 * Input:
 * Enter any number: 22
 * Output:
 * Number is not divisible by 5 and 11
 *
 * Case 4: Number is not divisible by either 5 or 11
 * Input:
 * Enter any number: 13
 * Output:
 * Number is not divisible by 5 and 11
 *
 * Case 5: Negative number divisible by both 5 and 11
 * Input:
 * Enter any number: -55
 * Output:
 * Number is divisible by 5 and 11
 *
 * Case 6: Edge case - Zero (0 is divisible by any number)
 * Input:
 * Enter any number: 0
 * Output:
 * Number is divisible by 5 and 11
 */

import java.util.Scanner;

public class DivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if ((num % 5 == 0) && (num % 11 == 0)) {
            System.out.println("Number is divisible by 5 and 11");
        } else {
            System.out.println("Number is not divisible by 5 and 11");
        }

        sc.close();
    }
}