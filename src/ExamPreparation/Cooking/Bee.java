package ExamPreparation.Cooking;

import java.util.Scanner;

public class Bee {
    public static int beeX = 0;
    public static int beeY = 0;
    public static int flowers = 0;
    public static boolean isInScope = true;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);
                matrix[i][j] = currentChar;
                if (currentChar == 'B') {
                    beeX = i;
                    beeY = j;
                }
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            int moveX = 0;
            int moveY = 0;
            switch (command) {
                case "up":
                    beeMove(matrix, (moveX - 1), moveY);
                    break;
                case "down":
                    beeMove(matrix, moveX + 1, moveY);
                    break;
                case "left":
                    beeMove(matrix, moveX, moveY - 1);
                    break;
                case "right":
                    beeMove(matrix, moveX, moveY + 1);
                    break;
            }
            if (!isInScope) break;
            command = scanner.nextLine();
        }
        if (!isInScope){
            System.out.println("The bee got lost!");
        }
        if (flowers>= 5){
            System.out.println("Great job, the bee manage to pollinate " + flowers + " flowers!");
        }else {
            System.out.println("The bee couldn't pollinate the flowers, she needed " + (5 - flowers) + " flowers more");
        }
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    public static void beeMove(char[][] matrix, int moveX, int moveY) {
        matrix[beeX][beeY] = '.';
        beeX += moveX;
        beeY += moveY;
        if (0 <= beeX && beeX < matrix.length && 0 <= beeY && beeY < matrix[0].length) {
            if (matrix[beeX][beeY] == 'f') {
                flowers++;
                matrix[beeX][beeY] = 'B';
            } else if (matrix[beeX][beeY] == 'O') {
                beeMove(matrix, moveX, moveY);
            }
            matrix[beeX][beeY] = 'B';
        }else {
            isInScope = false;
        }
    }
}
