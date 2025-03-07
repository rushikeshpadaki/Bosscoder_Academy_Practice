/**
 * Title: Find the Greatest of Three Numbers
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program determines the greatest of three given integers.
 * - It prompts the user to enter three integers.
 * - It compares the numbers using conditional statements to find the largest.
 * - Finally, it displays the largest number.
 *
 * Algorithm:
 * 1. Prompt the user to enter three integers.
 * 2. Read the three integer inputs.
 * 3. Compare:
 *    - If num1 is greater than or equal to num2 and num3, num1 is the largest.
 *    - Else if num2 is greater than or equal to num3, num2 is the largest.
 *    - Otherwise, num3 is the largest.
 * 4. Print the largest number.
 *
 * Time Complexity:
 * - O(1) (Constant time) as only a fixed number of comparisons are performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) since only a few integer variables are used.
 *
 * Sample Execution:
 *
 * Case 1: First number is largest
 * Input:
 * Enter three numbers: 9 5 3
 * Output:
 * 9 is the largest number.
 *
 * Case 2: Second number is largest
 * Input:
 * Enter three numbers: 4 8 2
 * Output:
 * 8 is the largest number.
 *
 * Case 3: Third number is largest
 * Input:
 * Enter three numbers: 6 7 12
 * Output:
 * 12 is the largest number.
 *
 * Case 4: All numbers are equal
 * Input:
 * Enter three numbers: 5 5 5
 * Output:
 * 5 is the largest number.
 *
 * Case 5: Negative numbers
 * Input:
 * Enter three numbers: -4 -2 -8
 * Output:
 * -2 is the largest number.
 */

import java.util.Scanner;

public class GreatestOfThreeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Finding the largest number using conditional statements
        if (num1 >= num2) {
            if (num1 >= num3)
                System.out.printf("%d is the largest number.\n", num1);
            else
                System.out.printf("%d is the largest number.\n", num3);
        } else {
            if (num2 >= num3)
                System.out.printf("%d is the largest number.\n", num2);
            else
                System.out.printf("%d is the largest number.\n", num3);
        }

        scanner.close();
    }
}