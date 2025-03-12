import java.util.Scanner;

/**
 * Title: Constant Time Complexity Example
 * Author: Rushikesh Padaki
 * Date: 12 March 2025
 *
 * Description:
 * This program demonstrates an example of constant time complexity (O(1)).
 * - It takes two integer inputs from the user and calculates their sum.
 * - The addition operation and printing result are constant time operations.
 *
 * Algorithm:
 * 1. Take two integer inputs from the user.
 * 2. Perform the addition operation.
 * 3. Print the result.
 *
 * Time Complexity:
 * - O(1) — Constant time operation.
 *
 * Space Complexity:
 * - O(1) — Constant extra space used.
 *
 * Sample Execution:
 *
 * Case 1: Adding two positive numbers
 * Input:
 * Enter first number: 3
 * Enter second number: 5
 * Output:
 * Result = 8
 */

public class ConstantTimeComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two integer inputs from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate sum (constant time operation)
        int result = num1 + num2;

        // Display result
        System.out.println("Result = " + result);

        sc.close();
    }
}