import java.util.Scanner;

/**
 * Title: Polynomial Time Complexity Example
 * Author: Rushikesh Padaki
 * Date: 12 March 2025
 *
 * Description:
 * This program demonstrates an example of polynomial time complexity (O(n³)).
 * - It multiplies two matrices using the standard matrix multiplication algorithm.
 * - Matrix multiplication involves three nested loops, leading to a cubic time complexity.
 *
 * Algorithm:
 * 1. Take matrix dimensions and elements from the user.
 * 2. Check if matrix multiplication is possible.
 * 3. Multiply matrices using three nested loops.
 * 4. Display the original matrices and the resultant matrix.
 *
 * Time Complexity:
 * - O(n³) — Polynomial time complexity due to three nested loops.
 *
 * Space Complexity:
 * - O(n²) — Space required for storing matrices.
 *
 * Sample Execution:
 *
 * Case 1: Multiplying two compatible matrices
 * Input:
 * Enter the row and column size of Matrix A:
 * 2 3
 * Enter the row and column size of Matrix B:
 * 3 2
 * Enter the elements for Matrix A:
 * Enter the value for index (0, 0) : 1
 * Enter the value for index (0, 1) : 2
 * Enter the value for index (0, 2) : 3
 * Enter the value for index (1, 0) : 4
 * Enter the value for index (1, 1) : 5
 * Enter the value for index (1, 2) : 6
 *
 * Enter the elements for Matrix B:
 * Enter the value for index (0, 0) : 7
 * Enter the value for index (0, 1) : 8
 * Enter the value for index (1, 0) : 9
 * Enter the value for index (1, 1) : 10
 * Enter the value for index (2, 0) : 11
 * Enter the value for index (2, 1) : 12
 *
 * Output:
 * Matrix A:
 * 1 2 3
 * 4 5 6
 *
 * Matrix B:
 * 7 8
 * 9 10
 * 11 12
 *
 * Matrix C (Resultant Matrix of Multiplication of Matrices A and B):
 * 58 64
 * 139 154
 */

public class PolynomialTimeComplexity {

    /**
     * Multiplies two matrices and returns the resultant matrix.
     * @param matrixA First input matrix
     * @param matrixB Second input matrix
     * @param rowA Number of rows in matrixA
     * @param columnA Number of columns in matrixA
     * @param columnB Number of columns in matrixB
     * @return Resultant matrix after multiplication
     */
    static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB, int rowA, int columnA, int columnB) {
        int[][] matrixC = new int[rowA][columnB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                for (int k = 0; k < columnA; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixC;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row and column size of Matrix A: ");
        int rowA = sc.nextInt();
        int columnA = sc.nextInt();

        System.out.println("Enter the row and column size of Matrix B: ");
        int rowB = sc.nextInt();
        int columnB = sc.nextInt();

        if (columnA == rowB) {
            int[][] matrixA = new int[rowA][columnA];
            int[][] matrixB = new int[rowB][columnB];

            // Input for Matrix A
            System.out.println("Enter the elements for Matrix A:");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.print("Enter the value for index (" + i + ", " + j + ") : ");
                    matrixA[i][j] = sc.nextInt();
                }
            }
            System.out.println();

            // Input for Matrix B
            System.out.println("Enter the elements for Matrix B:");
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.print("Enter the value for index (" + i + ", " + j + ") : ");
                    matrixB[i][j] = sc.nextInt();
                }
            }
            System.out.println();

            // Matrix Multiplication
            int[][] matrixC = multiplyMatrices(matrixA, matrixB, rowA, columnA, columnB);

            // Display Matrix A
            System.out.println("Matrix A:");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }

            // Display Matrix B
            System.out.println("Matrix B:");
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.print(matrixB[i][j] + " ");
                }
                System.out.println();
            }

            // Display Resultant Matrix
            System.out.println("Matrix C (Resultant Matrix of Multiplication of Matrices A and B):");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.print(matrixC[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix Multiplication is not possible!");
        }

        sc.close();
    }
}