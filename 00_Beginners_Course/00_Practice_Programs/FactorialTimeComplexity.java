import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Title: Factorial Time Complexity Example
 * Author: Rushikesh Padaki
 * Date: 12 March 2025
 *
 * Description:
 * This program demonstrates an example of factorial time complexity (O(n!)).
 * - It generates and displays all possible permutations of a given string.
 * - The number of permutations of a string of length `n` is `n!`.
 *
 * Algorithm:
 * 1. Take an input string from the user.
 * 2. Generate permutations using a recursive backtracking approach.
 * 3. Display all the generated permutations.
 *
 * Time Complexity:
 * - O(n!) — Factorial time complexity due to the number of permutations.
 *
 * Space Complexity:
 * - O(n) — Space used by the recursion call stack.
 *
 * Sample Execution:
 *
 * Case 1: Generate all permutations of "abc"
 * Input:
 * Enter a string: abc
 *
 * Output:
 * All permutations of abc: abc acb bac bca cab cba
 */

public class FactorialTimeComplexity {

    /**
     * Generates all permutations of the input string.
     * @param input The input string
     * @return A list of all permutations of the input string
     */
    public static List<String> generatePermutations(String input) {
        List<String> permutations = new ArrayList<>();
        permute(input, 0, input.length() - 1, permutations);
        return permutations;
    }

    /**
     * Helper method to generate permutations using backtracking.
     * @param str The input string
     * @param left The starting index
     * @param right The ending index
     * @param permutations The list to store generated permutations
     */
    private static void permute(String str, int left, int right, List<String> permutations) {
        if (left == right) {
            permutations.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right, permutations);
                str = swap(str, left, i); // backtrack
            }
        }
    }

    /**
     * Swaps two characters in a string.
     * @param str The input string
     * @param i First index
     * @param j Second index
     * @return The modified string after swapping
     */
    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        List<String> permutations = generatePermutations(input);
        System.out.println("All permutations of " + input + ":");
        for (String permutation : permutations) {
            System.out.print(permutation + " ");
        }

        sc.close();
    }
}