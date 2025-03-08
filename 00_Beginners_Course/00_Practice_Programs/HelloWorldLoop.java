/**
 * Title: Hello World Loop
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program prints "Hello, World!" a specified number of times using a `while` loop.
 * - The program reads an integer input `n` from the user.
 * - It initializes a loop variable `i` to 1.
 * - A `while` loop is used to print "Hello, World!" until `i` exceeds `n`.
 * - In each iteration, it increments the loop variable by 1.
 * - Once the loop condition becomes false, the loop exits and the program terminates.
 *
 * Algorithm:
 * 1. Read input `n` from user.
 * 2. Initialize loop variable `i = 1`.
 * 3. While `i <= n`:
 *    - Print "Hello, World!"
 *    - Increment `i` by 1
 * 4. End while loop when condition fails.
 *
 * Time Complexity:
 * - O(n) → The loop executes `n` times.
 *
 * Space Complexity:
 * - O(1) → Constant extra space is used for the loop variable.
 *
 * Sample Execution:
 *
 * Case 1: Normal case
 * Input:
 * How many times do you want to print Hello, World: 3
 * Output:
 * Hello, World!
 * Hello, World!
 * Hello, World!
 *
 * Case 2: Edge case - Zero times
 * Input:
 * How many times do you want to print Hello, World: 0
 * Output:
 * (No output)
 */

import java.util.Scanner;

public class HelloWorldLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many times do you want to print Hello, World: ");
        int n = sc.nextInt();

        int i = 1; // Loop variable
        while (i <= n) {
            System.out.println("Hello, World!");
            i++;
        }

        sc.close();
    }
}