/**
 * Title: Addition Program
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program takes two integer inputs from the user and calculates their sum.
 * - It prompts the user to enter two numbers.
 * - It reads both integer inputs.
 * - It computes the addition (num1 + num2).
 * - Finally, it displays the result.
 *
 * Algorithm:
 * 1. Prompt the user to enter the first number.
 * 2. Read the first integer input.
 * 3. Prompt the user to enter the second number.
 * 4. Read the second integer input.
 * 5. Compute the sum (num1 + num2).
 * 6. Display the result.
 *
 * Time Complexity:
 * - O(1) (Constant time) since only a single addition operation is performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a few integer variables are used.
 *
 * Sample Execution:
 *
 * Case 1: Normal addition
 * Input:
 * Enter first number: 10
 * Enter second number: 5
 * Output:
 * 10 + 5 = 15
 *
 * Case 2: Adding a negative number
 * Input:
 * Enter first number: 8
 * Enter second number: -3
 * Output:
 * 8 + (-3) = 5
 *
 * Case 3: Adding zero
 * Input:
 * Enter first number: 7
 * Enter second number: 0
 * Output:
 * 7 + 0 = 7
 *
 * Case 4: Both numbers are negative
 * Input:
 * Enter first number: -6
 * Enter second number: -4
 * Output:
 * -6 + (-4) = -10
 */

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        sc.close();
    }
}