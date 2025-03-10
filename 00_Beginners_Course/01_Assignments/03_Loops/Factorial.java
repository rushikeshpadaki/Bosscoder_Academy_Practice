/**
 * Title: Factorial Calculator
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program calculates the factorial of a positive integer using recursion.
 * - The program reads an integer input `n` from the user.
 * - It uses a recursive function `factorial(int n)` to calculate the factorial:
 *   - If `n == 0` or `n == 1`, return 1 (base case).
 *   - Otherwise, return `n * factorial(n - 1)`.
 * - The result is displayed to the user.
 * - If a negative number is entered, it displays an error message.
 *
 * Algorithm:
 * 1. Read input `n` from the user.
 * 2. If `n < 0`, display an error message.
 * 3. Call the recursive function `factorial(n)`:
 *    - Base case: If `n == 0` or `n == 1`, return 1.
 *    - Recursive case: Return `n * factorial(n - 1)`.
 * 4. Print the calculated factorial.
 *
 * Time Complexity:
 * - O(n) → Recursion runs `n` times.
 *
 * Space Complexity:
 * - O(n) → Recursive calls use stack space.
 *
 * Sample Execution:
 *
 * Case 1: Normal case
 * Input:
 * Enter a positive number: 5
 * Output:
 * Factorial of 5 = 120
 *
 * Case 2: Edge case - Minimum positive number
 * Input:
 * Enter a positive number: 1
 * Output:
 * Factorial of 1 = 1
 *
 * Case 3: Edge case - Factorial of zero
 * Input:
 * Enter a positive number: 0
 * Output:
 * Factorial of 0 = 1
 *
 * Case 4: Edge case - Negative number
 * Input:
 * Enter a positive number: -5
 * Output:
 * Factorial of a negative number is undefined.
 */

import java.util.Scanner;

public class Factorial {

    /**
     * Calculates the factorial of a number using recursion.
     * @param n The input number.
     * @return Factorial of the input number.
     */
    static int factorial(int n) {
        if ((n == 0) || (n == 1))
            return 1;
        return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial of a negative number is undefined.");
        } else {
            System.out.println("Factorial of " + n + " = " + factorial(n));
        }

        sc.close();
    }
}