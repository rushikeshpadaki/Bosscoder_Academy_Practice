import java.util.Scanner;

/**
 * Title: Average of Three Numbers
 * Author: Rushikesh Padaki
 * Date: 09 March 2025
 *
 * Description:
 * This program takes three integers as input and calculates their average.
 * - The average is computed as the sum of the three numbers divided by 3.
 * - The result is returned as an integer (truncated if the result is not a whole number).
 *
 * Algorithm:
 * 1. Read three integers from the user.
 * 2. Calculate the sum of the three integers.
 * 3. Divide the sum by 3 to get the average.
 * 4. Return the average value.
 *
 * Time Complexity:
 * - O(1)
 *
 * Space Complexity:
 * - O(1)
 *
 * Sample Execution:
 *
 * Case 1: Average of three positive numbers
 * Input:
 * Enter three numbers: 10 20 30
 * Output:
 * Average of the entered numbers = 20
 *
 * Case 2: Average of mixed positive and negative numbers
 * Input:
 * Enter three numbers: 5 -2 9
 * Output:
 * Average of the entered numbers = 4
 */

public class Average {

    /**
     * Finds the average of three integers.
     *
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @param num3 The third integer.
     * @return The average of the three integers.
     */
    static int findAverage(int num1, int num2, int num3) {
        return ((num1 + num2 + num3) / 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Average of the entered numbers = " + findAverage(num1, num2, num3));

        sc.close();
    }
}