import java.util.Scanner;

/**
 * Title: Power Calculation
 * Author: Rushikesh Padaki
 * Date: 09 March 2025
 *
 * Description:
 * This program calculates the power of a number using a loop.
 * - The base and exponent are provided as input.
 * - The result is computed using a loop and returned as an integer.
 *
 * Algorithm:
 * 1. Read the base and exponent from the user.
 * 2. Initialize the result to 1.
 * 3. Multiply the result by the base `exponent` times.
 * 4. Return the final result.
 *
 * Time Complexity:
 * - O(exponent)
 *
 * Space Complexity:
 * - O(1)
 *
 * Sample Execution:
 *
 * Case 1: Positive base and positive exponent
 * Input:
 * Enter the value for base: 2
 * Enter the value for exponent: 3
 * Output:
 * Power(2, 3) = 8
 *
 * Case 2: Base = 5, Exponent = 0
 * Input:
 * Enter the value for base: 5
 * Enter the value for exponent: 0
 * Output:
 * Power(5, 0) = 1
 */

public class Power {

    /**
     * Calculates the power of a base raised to an exponent.
     *
     * @param base The base value.
     * @param exponent The exponent value.
     * @return The result of base^exponent.
     */
    static int pow(int base, int exponent) {
        int power = 1;

        for (int i = 1; i <= exponent; i++) {
            power *= base;
        }

        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for base: ");
        int base = sc.nextInt();

        System.out.print("Enter the value for exponent: ");
        int exponent = sc.nextInt();

        System.out.println("Power(" + base + ", " + exponent + ") = " + pow(base, exponent));

        sc.close();
    }
}