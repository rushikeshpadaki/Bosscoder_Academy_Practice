/**
 * Title: Multiplication of Two Numbers
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program takes two integer inputs from the user and calculates their product.
 * - It prompts the user to enter two numbers.
 * - It multiplies the two numbers using the `*` operator.
 * - Finally, it displays the result.
 *
 * Algorithm:
 * 1. Prompt the user to enter the first number.
 * 2. Read the first integer input.
 * 3. Prompt the user to enter the second number.
 * 4. Read the second integer input.
 * 5. Compute `num1 * num2` and display the result.
 *
 * Time Complexity:
 * - O(1) (Constant time) since only a single multiplication operation is performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a few integer variables are used.
 *
 * Sample Execution:
 *
 * Case 1: Normal multiplication
 * Input:
 * Enter first number: 5
 * Enter second number: 4
 * Output:
 * 5 * 4 = 20
 *
 * Case 2: Multiplying with zero
 * Input:
 * Enter first number: 7
 * Enter second number: 0
 * Output:
 * 7 * 0 = 0
 *
 * Case 3: Multiplying with one
 * Input:
 * Enter first number: 8
 * Enter second number: 1
 * Output:
 * 8 * 1 = 8
 *
 * Case 4: Multiplying two negative numbers
 * Input:
 * Enter first number: -6
 * Enter second number: -3
 * Output:
 * -6 * -3 = 18
 *
 * Case 5: Multiplying a positive and a negative number
 * Input:
 * Enter first number: -7
 * Enter second number: 5
 * Output:
 * -7 * 5 = -35
 */

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        sc.close();
    }
}