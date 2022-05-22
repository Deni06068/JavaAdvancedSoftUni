package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int r = 0; r < matrixSize; r++) {
            int[] rowOfMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int c = 0; c < matrixSize; c++) {
                matrix[r][c] = rowOfMatrix[c];
            }
        }
        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;
        int rowForSecondDiagonal = matrixSize - 1;
        for (int row = 0; row < matrixSize; row++) {
            sumPrimaryDiagonal += matrix[row][row];
            sumSecondaryDiagonal += matrix[rowForSecondDiagonal][row];
            rowForSecondDiagonal--;
        }
        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));
    }
}
