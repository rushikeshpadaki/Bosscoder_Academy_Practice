import java.util.Scanner;

/**
 * Title: Fibonacci Sequence Generator
 * Author: Rushikesh Padaki
 * Date: 09 March 2025
 *
 * Description:
 * This program generates the first `n` terms of the Fibonacci sequence.
 * - The Fibonacci sequence starts with 0 and 1.
 * - Each subsequent term is the sum of the two preceding terms.
 *
 * Algorithm:
 * 1. Read the number of terms from the user.
 * 2. Create an array to store the Fibonacci sequence.
 * 3. Initialize the first two terms (0 and 1).
 * 4. Calculate each subsequent term as the sum of the two preceding terms.
 * 5. Return the array containing the Fibonacci sequence.
 *
 * Time Complexity:
 * - O(n)
 *
 * Space Complexity:
 * - O(n)
 *
 * Sample Execution:
 *
 * Case 1: Generate the first 5 Fibonacci numbers
 * Input:
 * Enter a number: 5
 * Output:
 * First 5 Fibonacci Numbers:
 * 0 1 1 2 3
 *
 * Case 2: Generate the first 8 Fibonacci numbers
 * Input:
 * Enter a number: 8
 * Output:
 * First 8 Fibonacci Numbers:
 * 0 1 1 2 3 5 8 13
 */

public class Fibonacci {

    /**
     * Generates the Fibonacci sequence up to the given number of terms.
     *
     * @param num The number of terms to generate.
     * @return An array containing the Fibonacci sequence.
     */
    static int[] generateFibonacci(int num) {
        int[] fib = new int[num];

        for (int i = 0; i < num; i++) {
            if (i == 0 || i == 1) {
                fib[i] = i;
            } else {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }

        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("First " + num + " Fibonacci Numbers: ");
        int[] fibNums = generateFibonacci(num);
        for (int f : fibNums) {
            System.out.print(f + " ");
        }

        sc.close();
    }
}
