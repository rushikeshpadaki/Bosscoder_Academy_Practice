import java.util.Scanner;

/**
 * Title: Sum of Even Numbers
 * Author: Rushikesh Padaki
 * Date: 09 March 2025
 *
 * Description:
 * This program calculates the sum of all even numbers from 1 to a given number.
 * - It iterates through all numbers from 1 to the input value.
 * - If the number is even, it adds it to the sum.
 *
 * Algorithm:
 * 1. Read an integer from the user.
 * 2. Initialize the sum to 0.
 * 3. Iterate through numbers from 1 to the input value:
 *     - If the number is even, add it to the sum.
 * 4. Return the final sum.
 *
 * Time Complexity:
 * - O(n)
 *
 * Space Complexity:
 * - O(1)
 *
 * Sample Execution:
 *
 * Case 1: Sum of even numbers up to a positive number
 * Input:
 * Enter a number: 10
 * Output:
 * The sum of all even numbers from 1 to 10 = 30
 *
 * Case 2: Sum of even numbers up to a small number
 * Input:
 * Enter a number: 3
 * Output:
 * The sum of all even numbers from 1 to 3 = 2
 */

public class EvenSum {

    /**
     * Calculates the sum of all even numbers from 1 to the given number.
     *
     * @param num The upper limit for the sum calculation.
     * @return The sum of even numbers from 1 to num.
     */
    static int calculateEvenSum(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The sum of all even numbers from 1 to " + num + " = " + calculateEvenSum(num));

        sc.close();
    }
}