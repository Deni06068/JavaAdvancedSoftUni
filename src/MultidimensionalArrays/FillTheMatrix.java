package MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = rows;
        int[][] matrix = new int[rows][cols];
        char type = input[1].charAt(0);
        switch (type) {
            case 'A':
                matrix = new int[rows][cols];
                int number = 1;
                for (int r = 0; r < rows; r++) {
                    for (int c = 0; c < cols; c++) {
                        matrix[c][r] = number;
                        number++;
                    }
                }
                break;
            case 'B':
                matrix = new int[rows][cols];
                number = 1;

                for (int c = 0; c < cols; c++) {
                    if (c % 2 == 0) {
                        for (int r = 0; r < rows; r++) {
                            matrix[r][c] = number;
                            number++;
                        }
                    } else {
                        for (int r = rows - 1; r >= 0; r--) {
                            matrix[r][c] = number;
                            number++;
                        }
                    }
                }
                break;
        }
        for (int[] ints : matrix) {
            for (int num : ints) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
