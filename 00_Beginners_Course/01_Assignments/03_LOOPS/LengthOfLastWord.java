/**
 * Title: Length of Last Word in a String
 * Author: Rushikesh Padaki
 * Date: 08 March 2025
 *
 * Description:
 * This program finds the length of the last word in a string.
 * - The program reads a string input from the user.
 * - It trims any trailing spaces.
 * - It counts the number of characters in the last word starting from the end:
 *   - If a space is encountered, the counting stops.
 * - The length of the last word is displayed to the user.
 *
 * Algorithm:
 * 1. Read a string input from the user.
 * 2. Trim any trailing spaces from the string.
 * 3. Initialize count = 0.
 * 4. Start counting characters from the end:
 *    - If a space is encountered, stop counting.
 * 5. Return the count.
 * 6. Display the length of the last word.
 *
 * Time Complexity:
 * - O(n) → Where n is the length of the string (in the worst case, we traverse the whole string).
 *
 * Space Complexity:
 * - O(1) → Constant space used.
 *
 * Sample Execution:
 *
 * Case 1: Normal case
 * Input:
 * Enter a string: Hello World
 * Output:
 * Length of the last word of the entered string = 5
 *
 * Case 2: Trailing spaces
 * Input:
 * Enter a string: Hello World
 * Output:
 * Length of the last word of the entered string = 5
 *
 * Case 3: Single word
 * Input:
 * Enter a string: Programming
 * Output:
 * Length of the last word of the entered string = 11
 *
 * Case 4: Leading and trailing spaces
 * Input:
 * Enter a string:   OpenAI is great
 * Output:
 * Length of the last word of the entered string = 5
 *
 * Case 5: Empty string
 * Input:
 * Enter a string:
 * Output:
 * Length of the last word of the entered string = 0
 */

import java.util.Scanner;

public class LengthOfLastWord {

    /**
     * Finds the length of the last word in a string.
     * @param str The input string.
     * @return Length of the last word.
     */
    static int findLengthOfLastWord(String str) {
        // Trim any trailing spaces
        str = str.trim();

        int count = 0;

        // Start from the end and count characters until space is encountered
        for (int i = (str.length() - 1); i >= 0; i--) {
            if (str.charAt(i) == ' ')
                break;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length of the last word of the entered string = " + findLengthOfLastWord(str));

        sc.close();
    }
}