/**
 * Title: Input and Output Program
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program takes an integer input from the user and prints it back.
 * - It prompts the user to enter a number.
 * - It reads the input using Scanner.
 * - It then displays the entered number.
 *
 * Algorithm:
 * 1. Prompt the user to enter an integer.
 * 2. Read the integer input from the user.
 * 3. Display the entered number.
 *
 * Time Complexity:
 * - O(1) (Constant time) since only a single input and output operation is performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a few integer variables are used.
 *
 * Sample Execution:
 *
 * Case 1: Normal input
 * Input:
 * Enter a number: 10
 * Output:
 * You have entered the number: 10
 *
 * Case 2: Negative number input
 * Input:
 * Enter a number: -5
 * Output:
 * You have entered the number: -5
 *
 * Case 3: Large number input
 * Input:
 * Enter a number: 987654321
 * Output:
 * You have entered the number: 987654321
 */

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("You have entered the number: " + num);

        sc.close();
    }
}