/**
 * Title: Average of Two Numbers
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program calculates the average of two integer numbers.
 * - It prompts the user to enter two numbers.
 * - It computes their sum and divides by 2 to get the average.
 * - Finally, it displays the result.
 *
 * Algorithm:
 * 1. Prompt the user to enter the first number.
 * 2. Read the first integer input.
 * 3. Prompt the user to enter the second number.
 * 4. Read the second integer input.
 * 5. Compute `(num1 + num2) / 2` and display the result.
 *
 * Time Complexity:
 * - O(1) (Constant time) since only a few arithmetic operations are performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a few integer variables are used.
 *
 * Sample Execution:
 *
 * Case 1: Normal input
 * Input:
 * Enter first number: 10
 * Enter second number: 20
 * Output:
 * Average of 10 and 20 = 15
 *
 * Case 2: Using negative numbers
 * Input:
 * Enter first number: -5
 * Enter second number: 15
 * Output:
 * Average of -5 and 15 = 5
 *
 * Case 3: When both numbers are the same
 * Input:
 * Enter first number: 8
 * Enter second number: 8
 * Output:
 * Average of 8 and 8 = 8
 *
 * Case 4: When the sum is an odd number (integer division issue)
 * Input:
 * Enter first number: 7
 * Enter second number: 8
 * Output:
 * Average of 7 and 8 = 7
 * (Note: Integer division truncates the decimal part)
 *
 * Case 5: Large numbers
 * Input:
 * Enter first number: 1000000
 * Enter second number: 2000000
 * Output:
 * Average of 1000000 and 2000000 = 1500000
 */

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Average of " + num1 + " and " + num2 + " = " + ((num1 + num2) / 2));
    }
}
