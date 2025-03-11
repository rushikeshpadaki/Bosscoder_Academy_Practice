import java.util.Scanner;

/**
 * Title: Sum Calculator  
 * Author: Rushikesh Padaki  
 * Date: 11 March 2025  
 *  
 * Description:  
 * This program calculates the sum of two integers.  
 * - The program reads two integer inputs `num1` and `num2` from the user.  
 * - It calls a method `calculateSum` to compute the sum of these two numbers.  
 * - The result is then displayed to the user.  
 *  
 * Algorithm:  
 * 1. Read input `num1` and `num2` from user.  
 * 2. Call the `calculateSum` method with `num1` and `num2` as arguments.  
 * 3. Display the result returned by the method.  
 *  
 * Time Complexity:  
 * - O(1) → Constant time operation.  
 *  
 * Space Complexity:  
 * - O(1) → Constant extra space used for input and result variables.  
 *  
 * Sample Execution:  
 *  
 * Case 1: Normal case  
 * Input:  
 * Enter first number: 5  
 * Enter second number: 7  
 * Output:  
 * The sum of 5 and 7 is: 12  
 *  
 * Case 2: Adding a positive and negative integer  
 * Input:  
 * Enter first number: 8  
 * Enter second number: -3  
 * Output:  
 * The sum of 8 and -3 is: 5  
 *  
 * Case 3: Edge case - Adding two zeros  
 * Input:  
 * Enter first number: 0  
 * Enter second number: 0  
 * Output:  
 * The sum of 0 and 0 is: 0  
 */

public class SumCalculator {

    /**
     * Calculates the sum of two integers.
     *
     * @param num1 First integer
     * @param num2 Second integer
     * @return Sum of num1 and num2
     */
    static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = calculateSum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close();
    }
}
