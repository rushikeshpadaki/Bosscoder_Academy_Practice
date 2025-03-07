/**
 * Title: Find the Greatest of Four Numbers
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program determines the greatest of four given integers using an if-else-if ladder.
 * - It prompts the user to enter four integers.
 * - It compares each number using a structured if-else-if ladder.
 * - Finally, it prints the largest number in the format: "<number> is the biggest number!".
 *
 * Algorithm:
 * 1. Prompt the user to enter four integers.
 * 2. Read the four integer inputs.
 * 3. Use an if-else-if ladder to determine the largest number:
 *    - Compare `num1`, `num2`, `num3`, and `num4` sequentially.
 *    - Print the largest number in the correct format.
 *
 * Time Complexity:
 * - O(1) (Constant time) as a fixed number of comparisons are performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) since only a few integer variables are used.
 *
 * Sample Execution:
 *
 * Case 1: First number is largest
 * Input:
 * Enter four numbers: 9 5 3 2
 * Output:
 * 9 is the biggest number!
 *
 * Case 2: Second number is largest
 * Input:
 * Enter four numbers: 4 8 2 6
 * Output:
 * 8 is the biggest number!
 *
 * Case 3: Third number is largest
 * Input:
 * Enter four numbers: 6 7 12 10
 * Output:
 * 12 is the biggest number!
 *
 * Case 4: Fourth number is largest
 * Input:
 * Enter four numbers: 4 5 3 9
 * Output:
 * 9 is the biggest number!
 *
 * Case 5: All numbers are equal
 * Input:
 * Enter four numbers: 5 5 5 5
 * Output:
 * 5 is the biggest number!
 *
 * Case 6: Negative numbers
 * Input:
 * Enter four numbers: -4 -2 -8 -3
 * Output:
 * -2 is the biggest number!
 */

import java.util.Scanner;

public class GreatestOfFourNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                if (num1 > num4) {
                    System.out.println(num1 + " is the biggest number!");
                } else {
                    System.out.println(num4 + " is the biggest number!");
                }
            }
        } else if (num2 > num3) {
            if (num2 > num4) {
                System.out.println(num2 + " is the biggest number!");
            } else {
                System.out.println(num4 + " is the biggest number!");
            }
        } else if (num3 > num4) {
            System.out.println(num3 + " is the biggest number!");
        } else {
            System.out.println(num4 + " is the biggest number!");
        }

        scanner.close();
    }
}