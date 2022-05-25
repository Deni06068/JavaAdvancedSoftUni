package MultidimensionalArrays;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();
        String input = scanner.nextLine();
        int maxColumnLength = Integer.MIN_VALUE;
        List<String> words = new ArrayList<>();
        while (!input.equals("END")) {
            int currentLength = input.length();
            if (currentLength > maxColumnLength) {
                maxColumnLength = currentLength;
            }
            words.add(input);
            input = scanner.nextLine();
        }
        int rows = words.size();
        int cols = maxColumnLength;

        char[][] matrix = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            String word = words.get(r);
            for (int c = 0; c < cols; c++) {
                if (c < word.length()){
                    char currentChar = word.charAt(c);
                    matrix[r][c] = currentChar;
                }else {
                    matrix[r][c] = ' ';
                }
            }
        }
        String angleString = rotation.split("[()]")[1];
        int angle = Integer.parseInt(angleString);
        int angleOfRotation = angle % 360;
        printMatrix(matrix, rows, cols, angleOfRotation);



    }

    private static void printMatrix(char[][] matrix, int rows, int cols, int angleOfRotation) {
        switch (angleOfRotation){
            case 0:
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int i = 0; i < cols; i++) {
                    for (int j = rows - 1; j >=0 ; j--) {
                        System.out.print(matrix[j][i]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int i = rows - 1; i >= 0 ; i--) {
                    for (int j = cols - 1; j >= 0 ; j--) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int i = cols - 1; i >= 0; i--) {
                    for (int j = 0; j < rows ; j++) {
                        System.out.print(matrix[j][i]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}
