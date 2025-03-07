/**
 * Title: Division of Two Numbers
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program takes two integer inputs from the user and calculates their division.
 * - It prompts the user to enter two numbers.
 * - It checks if the divisor is zero to prevent division errors.
 * - If the divisor is not zero, it computes the quotient using integer division (num1 / num2).
 * - Finally, it displays the result.
 *
 * Algorithm:
 * 1. Prompt the user to enter the first number.
 * 2. Read the first integer input.
 * 3. Prompt the user to enter the second number.
 * 4. Read the second integer input.
 * 5. Check if the second number (divisor) is zero:
 *    - If yes, display an error message.
 *    - If no, compute `num1 / num2` and display the result.
 *
 * Time Complexity:
 * - O(1) (Constant time) since only a single division operation is performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a few integer variables are used.
 *
 * Sample Execution:
 *
 * Case 1: Normal division
 * Input:
 * Enter first number: 10
 * Enter second number: 2
 * Output:
 * 10 / 2 = 5
 *
 * Case 2: Division with remainder (integer division truncates)
 * Input:
 * Enter first number: 7
 * Enter second number: 3
 * Output:
 * 7 / 3 = 2
 *
 * Case 3: Dividing by a negative number
 * Input:
 * Enter first number: 12
 * Enter second number: -4
 * Output:
 * 12 / -4 = -3
 *
 * Case 4: Both numbers are negative
 * Input:
 * Enter first number: -9
 * Enter second number: -3
 * Output:
 * -9 / -3 = 3
 *
 * Case 5: Edge case - Division by zero
 * Input:
 * Enter first number: 15
 * Enter second number: 0
 * Output:
 * Error: Division by zero is not allowed.
 */

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }

        sc.close();
    }
}