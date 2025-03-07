/**
 * Title: Sum of First N Natural Numbers
 * Name: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program calculates the sum of the first N natural numbers using the mathematical formula:
 * Sum = (N * (N + 1)) / 2
 * - The program prompts the user to enter a positive integer (N ≥ 1).
 * - It applies the formula to compute the sum efficiently in O(1) time complexity.
 * - If the user enters 0 or a negative number, an error message is displayed.
 * - Finally, it prints the result.
 *
 * Algorithm:
 * 1. Take an integer input (N) from the user.
 * 2. Check if N is greater than or equal to 1. If not, display an error message.
 * 3. Compute the sum using the formula: (N * (N + 1)) / 2.
 * 4. Display the result.
 *
 * Time Complexity:
 * - O(1) (Constant time) because the program performs a single mathematical operation, irrespective of N.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a few integer variables are used, and no extra memory is allocated based on input size.
 *
 * Sample Execution:
 *
 * Case 1: Normal input
 * Input:
 * Enter a number: 5
 * Output:
 * Sum of first '5' natural numbers = 15
 *
 * Case 2: Smallest natural number
 * Input:
 * Enter a number: 1
 * Output:
 * Sum of first '1' natural numbers = 1
 *
 * Case 3: Large input
 * Input:
 * Enter a number: 100
 * Output:
 * Sum of first '100' natural numbers = 5050
 *
 * Case 4: Zero as input (Invalid case)
 * Input:
 * Enter a number: 0
 * Output:
 * Error: Please enter a positive integer (N ≥ 1).
 *
 * Case 5: Negative input (Invalid case)
 * Input:
 * Enter a number: -5
 * Output:
 * Error: Please enter a positive integer (N ≥ 1).
 */

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("Error: Please enter a positive integer (N ≥ 1).");
        } else {
            System.out.println("Sum of first '" + num + "' natural numbers = " + ((num * (num + 1)) / 2));
        }

        sc.close();
    }
}