/**
 * Title: Maximum of Two Numbers
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program determines the maximum of two given numbers.
 * - It takes two integer inputs from the user.
 * - It uses the `max(int num1, int num2)` function, which internally uses `Math.max()`.
 * - Finally, it prints the maximum number in a formatted output.
 *
 * Algorithm:
 * 1. Prompt the user to enter two numbers.
 * 2. Read the integer inputs.
 * 3. Call the `max(int num1, int num2)` function:
 *    - Uses `Math.max(num1, num2)` to determine the maximum.
 * 4. Print the result as: "Maximum of <num1> and <num2> = <max>".
 *
 * Time Complexity:
 * - O(1) (Constant time) since only a single comparison is performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) since only integer variables are used.
 *
 * Sample Execution:
 *
 * Case 1: First number is greater
 * Input:
 * Enter first number: 10
 * Enter second number: 5
 * Output:
 * Maximum of 10 and 5 = 10
 *
 * Case 2: Second number is greater
 * Input:
 * Enter first number: 4
 * Enter second number: 9
 * Output:
 * Maximum of 4 and 9 = 9
 *
 * Case 3: Both numbers are equal
 * Input:
 * Enter first number: 7
 * Enter second number: 7
 * Output:
 * Maximum of 7 and 7 = 7
 *
 * Case 4: Negative numbers
 * Input:
 * Enter first number: -3
 * Enter second number: -8
 * Output:
 * Maximum of -3 and -8 = -3
 *
 * Case 5: One positive and one negative number
 * Input:
 * Enter first number: -10
 * Enter second number: 6
 * Output:
 * Maximum of -10 and 6 = 6
 */

import java.util.Scanner;

public class MaxOfTwo {
    /**
     * Returns the maximum of two numbers.
     * @param num1 First number.
     * @param num2 Second number.
     * @return The maximum of num1 and num2.
     */
    static int max(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Maximum of " + num1 + " and " + num2 + " = " + max(num1, num2));

        sc.close();
    }
}