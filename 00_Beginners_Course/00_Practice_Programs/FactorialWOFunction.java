/**
 * Title: Factorial Without Function  
 * Author: Rushikesh Padaki  
 * Date: 11 March 2025  
 *  
 * Description:  
 * This program calculates the factorial of predefined integers without using a separate function.  
 * - It uses a `for` loop to calculate the factorial.  
 * - The program calculates and displays the factorial for three hardcoded values (1, 2, and 3).  
 *  
 * Algorithm:  
 * 1. Initialize `num` and `fact` values.  
 * 2. Use a `for` loop to calculate the factorial:  
 *    - Multiply `fact` by the loop counter `i`.  
 * 3. Print the result.  
 * 4. Repeat for other hardcoded values.  
 *  
 * Time Complexity:  
 * - O(n) → Loop runs `n` times for each input.  
 *  
 * Space Complexity:  
 * - O(1) → Constant extra space is used.  
 *  
 * Sample Execution:  
 *  
 * Case 1: Factorial of 1  
 * Output:  
 * Factorial of 1 = 1  
 *  
 * Case 2: Factorial of 2  
 * Output:  
 * Factorial of 2 = 2  
 *  
 * Case 3: Factorial of 3  
 * Output:  
 * Factorial of 3 = 6  
 */

public class FactorialWOFunction {
    public static void main(String[] args) {

        // Case 1: Factorial of 1
        int num = 1, fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " = " + fact);

        // Case 2: Factorial of 2
        num = 2;
        fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " = " + fact);

        // Case 3: Factorial of 3
        num = 3;
        fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " = " + fact);
    }
}
