/**
 * Title: Palindrome Number Checker
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program checks if a given integer is a palindrome.
 * - A palindrome is a number that reads the same forward and backward.
 * - The program reverses the given integer and compares it with the original value.
 * - If both are the same, the number is a palindrome; otherwise, it's not.
 *
 * Algorithm:
 * 1. Read an integer from the user.
 * 2. If the number is negative, return false (negative numbers cannot be palindromes).
 * 3. Initialize `reverse = 0` and `temp = num`.
 * 4. While `temp != 0`:
 *    - Extract the last digit using `temp % 10`.
 *    - Add it to `reverse` after multiplying `reverse` by 10.
 *    - Remove the last digit from `temp` using `temp /= 10`.
 * 5. If `reverse` equals `num`, it's a palindrome; otherwise, it's not.
 * 6. Display the result.
 *
 * Time Complexity:
 * - O(d) → Where d is the number of digits in the input number.
 *
 * Space Complexity:
 * - O(1) → Constant space used.
 *
 * Sample Execution:
 *
 * Case 1: Palindrome number
 * Input:
 * Enter a number: 121
 * Output:
 * The entered number is a Palindrome number!
 *
 * Case 2: Not a palindrome number
 * Input:
 * Enter a number: 123
 * Output:
 * The entered number is not a Palindrome number!
 *
 * Case 3: Single-digit number
 * Input:
 * Enter a number: 7
 * Output:
 * The entered number is a Palindrome number!
 *
 * Case 4: Negative number
 * Input:
 * Enter a number: -121
 * Output:
 * The entered number is not a Palindrome number!
 *
 * Case 5: Edge case - Zero
 * Input:
 * Enter a number: 0
 * Output:
 * The entered number is a Palindrome number!
 */

import java.util.Scanner;

public class Palindrome {

    /**
     * Checks if a given number is a palindrome.
     * @param num The input number.
     * @return true if the number is a palindrome, false otherwise.
     */
    static boolean isPalindrome(int num) {
        if (num < 0) // Negative numbers are not palindromes
            return false;

        int temp = num, reverse = 0;

        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }

        return (reverse == num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num))
            System.out.println("The entered number is a Palindrome number!");
        else
            System.out.println("The entered number is not a Palindrome number!");

        sc.close();
    }
}
