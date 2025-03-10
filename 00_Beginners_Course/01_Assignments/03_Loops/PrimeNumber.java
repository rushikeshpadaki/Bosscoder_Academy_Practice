/**
 * Title: Prime Number Checker
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program checks whether a given number is a prime number or not.
 * - A prime number is a positive integer greater than 1 that has no divisors other than 1 and itself.
 * - It takes an integer input from the user.
 * - It uses a loop to check divisibility from 2 to √n.
 * - If the number is divisible by any value within this range, it is not prime.
 * - It prints whether the number is prime or not.
 *
 * Algorithm:
 * 1. Prompt the user to enter an integer.
 * 2. Read the input integer.
 * 3. If the input is less than or equal to 1, return false.
 * 4. Check divisibility from 2 to √n:
 *    - If divisible, return false.
 * 5. If no divisors are found, return true.
 * 6. Print the result.
 *
 * Time Complexity:
 * - O(√n) - The loop runs up to the square root of the number.
 *
 * Space Complexity:
 * - O(1) - Only a few integer variables are used.
 *
 * Sample Execution:
 *
 * Case 1: Prime number
 * Input:
 * Enter a number: 7
 * Output:
 * The entered number is a Prime Number!
 *
 * Case 2: Non-prime number
 * Input:
 * Enter a number: 10
 * Output:
 * The entered number is not a Prime Number!
 *
 * Case 3: Edge case - 1 (not prime)
 * Input:
 * Enter a number: 1
 * Output:
 * The entered number is not a Prime Number!
 *
 * Case 4: Edge case - Negative number
 * Input:
 * Enter a number: -7
 * Output:
 * The entered number is not a Prime Number!
 */

import java.util.Scanner;

public class PrimeNumber {
    /**
     * Checks if a number is prime.
     * @param n The input number.
     * @return true if the number is prime, false otherwise.
     */
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println("The entered number is a Prime Number!");
        else
            System.out.println("The entered number is not a Prime Number!");

        sc.close();
    }
}
