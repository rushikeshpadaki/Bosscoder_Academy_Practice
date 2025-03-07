/**
 * Title: Grade Calculator
 * Author: Rushikesh Padaki
 * Date: 07 March 2025
 *
 * Description:
 * This program determines a student's grade based on their score (0-100).
 * - It takes an integer score input from the user.
 * - It classifies the score into grades using a switch statement.
 * - The grading system is as follows:
 *    - 90-100: Grade A
 *    - 80-89: Grade B
 *    - 70-79: Grade C
 *    - 60-69: Grade D
 *    - 50-59: Grade E
 *    - Below 50: Grade F
 *
 * Algorithm:
 * 1. Prompt the user to enter their score (between 0 and 100).
 * 2. Read the integer input.
 * 3. Determine the grade using a switch statement:
 *    - Divide the score by 10 and match the case values.
 *    - Print the corresponding grade.
 *
 * Time Complexity:
 * - O(1) (Constant time) as only a single switch-case operation is performed.
 *
 * Space Complexity:
 * - O(1) (Constant space) as only a single integer variable is used.
 *
 * Sample Execution:
 *
 * Case 1: Score in Grade A range
 * Input:
 * Enter your score(0-100): 95
 * Output:
 * Grade: A
 *
 * Case 2: Score in Grade B range
 * Input:
 * Enter your score(0-100): 85
 * Output:
 * Grade: B
 *
 * Case 3: Score in Grade C range
 * Input:
 * Enter your score(0-100): 75
 * Output:
 * Grade: C
 *
 * Case 4: Score in Grade D range
 * Input:
 * Enter your score(0-100): 65
 * Output:
 * Grade: D
 *
 * Case 5: Score in Grade E range
 * Input:
 * Enter your score(0-100): 55
 * Output:
 * Grade: E
 *
 * Case 6: Score in Grade F range (below 50)
 * Input:
 * Enter your score(0-100): 40
 * Output:
 * Grade: F
 *
 * Case 7: Edge case - Score at lower boundary (0)
 * Input:
 * Enter your score(0-100): 0
 * Output:
 * Grade: F
 *
 * Case 8: Edge case - Score at upper boundary (100)
 * Input:
 * Enter your score(0-100): 100
 * Output:
 * Grade: A
 */

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score(0-100): ");
        int score = scanner.nextInt();

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            case 5:
                System.out.println("Grade: E");
                break;
            default:
                System.out.println("Grade: F");
                break;
        }

        scanner.close();
    }
}