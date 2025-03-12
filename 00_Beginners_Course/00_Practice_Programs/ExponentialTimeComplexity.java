import java.util.Scanner;

/**
 * Title: Exponential Time Complexity Example
 * Author: Rushikesh Padaki
 * Date: 12 March 2025
 *
 * Description:
 * This program demonstrates an example of exponential time complexity (O(2ⁿ)).
 * - It computes the Fibonacci number at a given position using a recursive approach.
 * - Due to the nature of recursive calls, the time complexity grows exponentially.
 *
 * Algorithm:
 * 1. Take an input value `n` from the user.
 * 2. Compute the Fibonacci number using recursion.
 * 3. Display the result.
 *
 * Time Complexity:
 * - O(2ⁿ) — Exponential time complexity due to recursive calls.
 *
 * Space Complexity:
 * - O(n) — Space used by the recursion call stack.
 *
 * Sample Execution:
 *
 * Case 1: Compute Fibonacci number at position 5
 * Input:
 * Enter a number: 5
 *
 * Output:
 * Fibonacci Number at position 5 is : 5
 */

public class ExponentialTimeComplexity {

    /**
     * Computes the Fibonacci number at a given position using recursion.
     * @param n The position of the Fibonacci number
     * @return Fibonacci number at position n
     */
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Fibonacci Number at position " + num + " is : " + fib(num));

        sc.close();
    }
}