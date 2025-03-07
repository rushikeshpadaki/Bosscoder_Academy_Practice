/**
 * Title: Even or Odd Number Checker
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program determines whether a given integer is even or odd.
 * - It prompts the user to enter an integer.
 * - It checks if the number is divisible by 2 using the modulus (`%`) operator.
 * - If divisible, the number is even; otherwise, it is odd.
 * - Finally, it displays the result.
 *
 * Algorithm:
 * 1. Prompt the user to enter an integer.
 * 2. Read the integer input.
 * 3. Check if `num % 2 == 0`:
 *    - If true, print "Even".
 *    - Otherwise, print "Odd".
 *
 * Time Complexity:
 * - O(1) (Constant time) since only a single arithmetic operation and comparison are performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a single integer variable is used.
 *
 * Sample Execution:
 *
 * Case 1: Even number
 * Input:
 * Enter a number: 8
 * Output:
 * The entered number is Even!
 *
 * Case 2: Odd number
 * Input:
 * Enter a number: 13
 * Output:
 * The entered number is Odd!
 *
 * Case 3: Zero as input
 * Input:
 * Enter a number: 0
 * Output:
 * The entered number is Even! (Zero is considered even)
 *
 * Case 4: Negative even number
 * Input:
 * Enter a number: -4
 * Output:
 * The entered number is Even!
 *
 * Case 5: Negative odd number
 * Input:
 * Enter a number: -7
 * Output:
 * The entered number is Odd!
 */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("The entered number is Even!");
        else
            System.out.println("The entered number is Odd!");

        sc.close();
    }
}