/**
 * Title: Factorial With Function  
 * Author: Rushikesh Padaki  
 * Date: 11 March 2025  
 *  
 * Description:  
 * This program calculates the factorial of a number using a separate function.  
 * - A method `calculateFactorial` is used to calculate the factorial of an integer.  
 * - The program calculates and displays the factorial for three hardcoded values (1, 2, and 3).  
 *  
 * Algorithm:  
 * 1. Call `calculateFactorial(num)` with the given value.  
 * 2. Inside the function, use a `for` loop to calculate the factorial:  
 *    - Multiply `fact` by the loop counter `i`.  
 * 3. Return the computed factorial value.  
 * 4. Display the result.  
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

public class FactorialWithFunction {

    /**
     * Calculates the factorial of a given integer.
     *
     * @param num The integer whose factorial is to be calculated
     * @return The factorial of the input integer
     */
    static int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // Case 1: Factorial of 1
        int num = 1;
        System.out.println("Factorial of " + num + " = " + calculateFactorial(num));

        // Case 2: Factorial of 2
        num = 2;
        System.out.println("Factorial of " + num + " = " + calculateFactorial(num));

        // Case 3: Factorial of 3
        num = 3;
        System.out.println("Factorial of " + num + " = " + calculateFactorial(num));
    }
}
