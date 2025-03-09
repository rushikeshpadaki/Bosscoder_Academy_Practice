/**
 * Title: Reverse of a Number
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program reverses the digits of an integer.
 * - It takes an integer input from the user.
 * - It handles positive, negative, and zero cases.
 * - The reversed number is calculated using modulus and division.
 *
 * Algorithm:
 * 1. Take an integer input `num` from the user.
 * 2. Initialize `rev = 0`.
 * 3. While `num != 0`:
 *    - Extract the last digit using `num % 10`.
 *    - Add it to `rev` after shifting existing digits left (×10).
 *    - Remove last digit from `num` using `num /= 10`.
 * 4. Return the reversed number.
 *
 * Time Complexity:
 * - O(log₁₀ n) – Number of digits in `num`
 *
 * Space Complexity:
 * - O(1) – Constant extra space used
 *
 * Sample Execution:
 *
 * Case 1: Positive number
 * Input:
 * Enter a number: 1234
 * Output:
 * The reverse of entered number = 4321
 *
 * Case 2: Negative number
 * Input:
 * Enter a number: -345
 * Output:
 * The reverse of entered number = -543
 *
 * Case 3: Single digit
 * Input:
 * Enter a number: 7
 * Output:
 * The reverse of entered number = 7
 *
 * Case 4: Zero
 * Input:
 * Enter a number: 0
 * Output:
 * The reverse of entered number = 0
 */

import java.util.Scanner;

public class Reverse {
    /**
     * Reverses the digits of an integer.
     * @param num The input integer.
     * @return The reversed integer.
     */
    static int reverseNum(int num) {
        int rev = 0;
        while (num != 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The reverse of entered number = " + reverseNum(num));

        sc.close();
    }
}