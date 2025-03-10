/**
 * Title: Square of a Number
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program computes the square of a given integer.
 * - It takes an integer input from the user.
 * - It calculates the square using the multiplication operator (`num * num`).
 * - It then prints the result.
 *
 * Algorithm:
 * 1. Prompt the user to enter an integer.
 * 2. Read the input integer.
 * 3. Compute the square of the integer using multiplication.
 * 4. Print the result.
 *
 * Time Complexity:
 * - O(1) (Constant time) - Only a single multiplication operation is performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) - Only a single integer variable is used.
 *
 * Sample Execution:
 *
 * Case 1: Positive number
 * Input:
 * Enter a number: 5
 * Output:
 * Square of 5 = 25
 *
 * Case 2: Negative number
 * Input:
 * Enter a number: -4
 * Output:
 * Square of -4 = 16
 *
 * Case 3: Zero
 * Input:
 * Enter a number: 0
 * Output:
 * Square of 0 = 0
 */

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Square of " + num + " = " + (num * num));

        sc.close();
    }
}