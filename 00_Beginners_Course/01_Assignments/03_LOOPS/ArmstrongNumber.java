/**
 * Title: Armstrong Number Checker
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program checks whether a given integer is an Armstrong number.
 * - An Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.
 * - Example: 153 = 1³ + 5³ + 3³
 *
 * Algorithm:
 * 1. Count the number of digits in the given number.
 * 2. Compute the sum of each digit raised to the power of the number of digits.
 * 3. If the sum matches the original number, it is an Armstrong number.
 *
 * Time Complexity:
 * - O(d) where d = number of digits in the number
 *
 * Space Complexity:
 * - O(1) (constant space)
 *
 * Sample Execution:
 *
 * Case 1: Armstrong number
 * Input:
 * Enter a number: 153
 * Output:
 * The entered number is an Armstrong Number!
 *
 * Case 2: Non-Armstrong number
 * Input:
 * Enter a number: 123
 * Output:
 * The entered number is not an Armstrong Number!
 *
 * Case 3: Edge case - Single digit number
 * Input:
 * Enter a number: 7
 * Output:
 * The entered number is an Armstrong Number!
 *
 * Case 4: Edge case - Negative number
 * Input:
 * Enter a number: -153
 * Output:
 * The entered number is not an Armstrong Number!
 */

import java.util.Scanner;

public class ArmstrongNumber {

    /**
     * Checks if a number is an Armstrong number.
     * @param num The input number.
     * @return true if the number is an Armstrong number, false otherwise.
     */
    static boolean isArmstrong(int num) {
        if (num < 0) return false;

        int digits = 0, sum = 0, temp = num;

        // Count the number of digits
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = num;
        while (temp != 0) {
            sum += (int) Math.pow(temp % 10, digits);
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num))
            System.out.println("The entered number is an Armstrong Number!");
        else
            System.out.println("The entered number is not an Armstrong Number!");

        sc.close();
    }
}