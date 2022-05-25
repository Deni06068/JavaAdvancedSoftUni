package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];
        String[][] matrix = new String[rows][];
        for (int i = 0; i < rows; i++) {
            String[] row = scanner.nextLine().split("\\s+");
            matrix[i] = row;
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] com = command.split("\\s+");
            if (com[0].equals("swap")) {
                int firstElementRow = Integer.parseInt(com[1]);
                int firstElementCol = Integer.parseInt(com[2]);
                int secondElementRow = Integer.parseInt(com[3]);
                int secondElementCol = Integer.parseInt(com[4]);
                if (com[0].equals("swap") && firstElementRow < rows && firstElementCol < cols && secondElementRow < rows && secondElementCol < cols
                        && firstElementRow >= 0 && firstElementCol >= 0 && secondElementRow >= 0 && secondElementCol >= 0 && com.length == 5) {
                    String memory = matrix[firstElementRow][firstElementCol];
                    matrix[firstElementRow][firstElementCol] = matrix[secondElementRow][secondElementCol];
                    matrix[secondElementRow][secondElementCol] = memory;
                    for (int r = 0; r < rows; r++) {
                        for (int c = 0; c < cols; c++) {
                            System.out.print(matrix[r][c] + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }
}
