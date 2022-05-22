package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixRowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = matrixRowsAndCols[0];
        int cols = matrixRowsAndCols[1];
        int[][] matrix = new int[rows][cols];
        int[][] matrixResult = new int[3][3];

        for (int i = 0; i < rows; i++) {
            int[] row = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = row;
        }
        int maxSum = Integer.MIN_VALUE;
        for (int r = 0; r < rows - 2; r++) {
            int sum = 0;
            for (int c = 0; c < cols - 2; c++) {
                sum = matrix[r][c] + matrix[r][c + 1] + matrix[r][c + 2]
                        + matrix[r + 1][c] + matrix[r + 1][c + 1] + matrix[r + 1][c + 2]
                        + matrix[r + 2][c] + matrix[r + 2][c + 1] + matrix[r + 2][c + 2];
                if (maxSum < sum) {
                    maxSum = sum;
                    matrixResult[0][0] = matrix[r][c];
                    matrixResult[0][1] = matrix[r][c + 1];
                    matrixResult[0][2] = matrix[r][c + 2];
                    matrixResult[1][0] = matrix[r + 1][c];
                    matrixResult[1][1] = matrix[r + 1][c + 1];
                    matrixResult[1][2] = matrix[r + 1][c + 2];
                    matrixResult[2][0] = matrix[r + 2][c];
                    matrixResult[2][1] = matrix[r + 2][c + 1];
                    matrixResult[2][2] = matrix[r + 2][c + 2];

                }
            }

        }

        System.out.println("Sum = " + maxSum);
        for (int i = 0; i < matrixResult.length; i++) {
            for (int j = 0; j < matrixResult[i].length; j++) {
                System.out.print(matrixResult[i][j] + " ");
            }
            System.out.println();
        }
    }
}
