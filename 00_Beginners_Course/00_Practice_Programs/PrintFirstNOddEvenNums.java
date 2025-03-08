/**
 * Title: Print First N Odd and Even Natural Numbers
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program prints the first `n` odd and even natural numbers.
 * - The program reads an integer input `n` from the user.
 * - It uses a `for` loop to print the first `n` odd numbers.
 * - It then uses another `for` loop to print the first `n` even numbers.
 * - Odd numbers are identified using `i % 2 != 0`.
 * - Even numbers are identified using `i % 2 == 0`.
 *
 * Algorithm:
 * 1. Read input `n` from user.
 * 2. Use a `for` loop to iterate from 1 to `2 * n`:
 *    - If `i % 2 != 0`, print `i` (for odd numbers).
 * 3. Use a `for` loop to iterate from 1 to `2 * n`:
 *    - If `i % 2 == 0`, print `i` (for even numbers).
 * 4. End loop when all `n` odd and even numbers are printed.
 *
 * Time Complexity:
 * - O(n) → Each loop runs up to `2 * n` iterations.
 *
 * Space Complexity:
 * - O(1) → Constant extra space is used for loop variables.
 *
 * Sample Execution:
 *
 * Case 1: Normal case
 * Input:
 * Enter a value for n: 5
 * Output:
 * First 5 Odd Natural Numbers: 1 3 5 7 9
 * First 5 Even Natural Numbers: 2 4 6 8 10
 *
 * Case 2: Edge case - Minimum input
 * Input:
 * Enter a value for n: 1
 * Output:
 * First 1 Odd Natural Numbers: 1
 * First 1 Even Natural Numbers: 2
 */

import java.util.Scanner;

public class PrintFirstNOddEvenNums {

    /**
     * Prints the first `n` odd natural numbers.
     * @param n The number of odd natural numbers to print.
     */
    static void printOddNums(int n) {
        System.out.print("First " + n + " Odd Natural Numbers: ");
        for (int i = 1; i <= (2 * n); i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Prints the first `n` even natural numbers.
     * @param n The number of even natural numbers to print.
     */
    static void printEvenNums(int n) {
        System.out.print("First " + n + " Even Natural Numbers: ");
        for (int i = 1; i <= (2 * n); i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for n: ");
        int n = sc.nextInt();

        printOddNums(n);
        printEvenNums(n);

        sc.close();
    }
}
