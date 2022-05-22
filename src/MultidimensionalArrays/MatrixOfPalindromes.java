package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = input[0];
        int col = input[1];
        String[][] matrix = new String[row][];
        for (int i = 0; i < row; i++) {
            matrix[i] = new String[col];
            char firstLetter = (char) (i + 97);
            for (int j = 0; j < col; j++) {
                char secondLetter = (char) ((char) firstLetter + j);
                String palindrome = "" + firstLetter + secondLetter + firstLetter;
                matrix[i][j] = palindrome;

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
