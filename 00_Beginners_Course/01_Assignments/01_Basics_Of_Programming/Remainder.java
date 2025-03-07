/**
 * Title: Remainder Calculation Program
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program calculates and displays the remainder when one integer is divided by another.
 * - It takes two integer inputs from the user.
 * - It computes the remainder using the modulus operator (`%`).
 * - It handles division by zero gracefully.
 * - Finally, it prints the result in a formatted manner.
 *
 * Algorithm:
 * 1. Take two integer inputs from the user.
 * 2. Check if the second number (divisor) is zero.
 * 3. If not, compute the remainder using the modulus operator (`num1 % num2`).
 * 4. Display the result.
 *
 * Time Complexity:
 * - O(1) (Constant time) since the modulus operation is performed once.
 *
 * Space Complexity:
 * - O(1) (Constant space) since only a few integer variables are used.
 *
 * Sample Execution:
 *
 * Case 1: Normal division with remainder
 * Input:
 * Enter first number: 10
 * Enter second number: 3
 * Output:
 * 10 % 3 = 1
 *
 * Case 2: Divisible without remainder
 * Input:
 * Enter first number: 15
 * Enter second number: 5
 * Output:
 * 15 % 5 = 0
 *
 * Case 3: First number is smaller than the second
 * Input:
 * Enter first number: 4
 * Enter second number: 7
 * Output:
 * 4 % 7 = 4
 *
 * Case 4: Using negative numbers
 * Input:
 * Enter first number: -10
 * Enter second number: 3
 * Output:
 * -10 % 3 = -1
 *
 * Case 5: When divisor is negative
 * Input:
 * Enter first number: 10
 * Enter second number: -3
 * Output:
 * 10 % -3 = 1
 *
 * Case 6: Both numbers are negative
 * Input:
 * Enter first number: -10
 * Enter second number: -3
 * Output:
 * -10 % -3 = -1
 *
 * Case 7: Edge case - Dividing by zero (causes an error)
 * Input:
 * Enter first number: 10
 * Enter second number: 0
 * Output:
 * Error: Division by zero is not allowed.
 */

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }

        sc.close();
    }
}