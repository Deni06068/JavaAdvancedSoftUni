package ExamPreparation.Cooking;

import java.util.Scanner;

public class PawnWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] chessField = new char[8][8];
        int whiteX = 0;
        int whiteY = 0;
        int blackX = 0;
        int blackY = 0;

        for (int i = 0; i < 8; i++) {
            String line = scanner.nextLine();
            if (line.indexOf('b') >= 0) {
                blackX = i;
                blackY = line.indexOf('b');
            }
            if (line.indexOf('w') >= 0) {
                whiteX = i;
                whiteY = line.indexOf('w');
            }
            chessField[i] = line.toCharArray();
        }

        while (whiteX != 0 || blackX != 7) {
            if (blackX == (whiteX - 1)) {
                if (blackY == whiteY - 1 || blackY == whiteY + 1) {
                    whiteY = blackY;
                    whiteX = blackX;
                    System.out.println("Game over! White capture on " + ((char) (97 + whiteY)) + (8 - whiteX) + ".");
                    break;
                }
            }
            whiteX--;
            chessField[whiteX + 1][whiteY] = '-';
            if (whiteX == 0) {
                chessField[blackX][blackY] = 'b';

                System.out.println("Game over! White pawn is promoted to a queen at " + ((char) (97 + whiteY)) + (8 - whiteX) + ".");

             break;
            }


            if (whiteX == (blackX + 1)){
                if (whiteY == blackY + 1 || whiteY == blackY - 1){
                    blackX = whiteX;
                    blackY = whiteY;
                    System.out.println("Game over! Black capture on " + ((char) (97 + blackY)) + (8 - blackX) + ".");
                    break;
                }
            }
            blackX++;
            chessField[blackX - 1][blackY] = '-';
            if (blackX == 7){
                chessField[whiteX][whiteY] = 'w';
                System.out.println("Game over! Black pawn is promoted to a queen at " + ((char) (97 + blackY)) + (8 - blackX) + ".");
                break;
            }

        }
    }
}
