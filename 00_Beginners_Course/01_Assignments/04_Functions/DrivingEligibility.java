import java.util.Scanner;

/**
 * Title: Driving Eligibility Checker
 * Author: Rushikesh Padaki
 * Date: 09 March 2025
 *
 * Description:
 * This program checks if a person is eligible to drive based on their age.
 * - A person is eligible for driving if their age is 18 or above.
 * - The program outputs the appropriate message based on the eligibility.
 *
 * Algorithm:
 * 1. Read the age from the user.
 * 2. Check if the age is 18 or above.
 *     - If yes, print "You are eligible for driving!!!".
 *     - If no, print "You are not eligible for driving yet!".
 *
 * Time Complexity:
 * - O(1)
 *
 * Space Complexity:
 * - O(1)
 *
 * Sample Execution:
 *
 * Case 1: Eligible for driving
 * Input:
 * Enter your age: 20
 * Output:
 * You are eligible for driving!!!
 *
 * Case 2: Not eligible for driving
 * Input:
 * Enter your age: 16
 * Output:
 * You are not eligible for driving yet!
 */

public class DrivingEligibility {

    /**
     * Checks if the person is eligible to drive.
     *
     * @param age The age of the person.
     * @return true if age is 18 or above, otherwise false.
     */
    static boolean checkEligibility(int age) {
        return (age >= 18);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (checkEligibility(age)) {
            System.out.println("You are eligible for driving!!!");
        } else {
            System.out.println("You are not eligible for driving yet!");
        }

        sc.close();
    }
}