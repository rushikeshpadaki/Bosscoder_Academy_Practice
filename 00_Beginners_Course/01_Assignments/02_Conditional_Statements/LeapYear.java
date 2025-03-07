/**
 * Title: Leap Year Checker
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program determines whether a given year is a leap year.
 * - It takes an integer input representing the year.
 * - It uses the leap year conditions:
 *   - A year is a leap year if:
 *     1. It is divisible by 4 but not by 100, OR
 *     2. It is divisible by 400.
 * - It prints whether the year "is a Leap Year!" or "is not a Leap Year!" accordingly.
 *
 * Algorithm:
 * 1. Prompt the user to enter a year.
 * 2. Read the integer input.
 * 3. Call the `isLeap(int year)` function:
 *    - Returns `true` if the year satisfies leap year conditions.
 *    - Returns `false` otherwise.
 * 4. Print whether the year "is a Leap Year!" or "is not a Leap Year!".
 *
 * Time Complexity:
 * - O(1) (Constant time) as only a few modulus operations are performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a single integer variable is used.
 *
 * Sample Execution:
 *
 * Case 1: Leap year (divisible by 4 but not by 100)
 * Input:
 * Enter a year: 2024
 * Output:
 * Year 2024 is a Leap Year!
 *
 * Case 2: Non-leap year (not divisible by 4)
 * Input:
 * Enter a year: 2023
 * Output:
 * Year 2023 is not a Leap Year!
 *
 * Case 3: Century year that is not a leap year (divisible by 100 but not by 400)
 * Input:
 * Enter a year: 1900
 * Output:
 * Year 1900 is not a Leap Year!
 *
 * Case 4: Century year that is a leap year (divisible by 400)
 * Input:
 * Enter a year: 2000
 * Output:
 * Year 2000 is a Leap Year!
 *
 * Case 5: Edge case - Minimum valid year
 * Input:
 * Enter a year: 1
 * Output:
 * Year 1 is not a Leap Year!
 */

import java.util.Scanner;

public class LeapYear {
    /**
     * Checks if a given year is a leap year.
     * @param year The input year.
     * @return true if the year is a leap year, false otherwise.
     */
    static boolean isLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeap(year))
            System.out.println("Year " + year + " is a Leap Year!");
        else
            System.out.println("Year " + year + " is not a Leap Year!");

        sc.close();
    }
}