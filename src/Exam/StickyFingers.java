package Exam;

import java.util.Scanner;

public class StickyFingers {
    public static int thiefX = 0;
    public static int thiefY = 0;
    public static boolean isInField = true;
    public static boolean isInJail = false;
    public static int money = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        String[] command = scanner.nextLine().split(",");
        char[][] field = new char[fieldSize][fieldSize];
        for (int i = 0; i < fieldSize; i++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            for (int j = 0; j < line.length(); j++) {
                char currentChar = line.charAt(j);
                field[i][j] = currentChar;
                if (currentChar == 'D'){
                    thiefX = i;
                    thiefY = j;
                }
            }
        }


        for (int i = 0; i < command.length; i++) {
            int moveX = 0;
            int moveY = 0;

            if (!isInJail) {
                switch (command[i]) {
                    case "left":
                        thiefMove(field, moveX, moveY - 1);
                        break;
                    case "right":
                        thiefMove(field, moveX, moveY + 1);
                        break;
                    case "up":
                        thiefMove(field, moveX - 1, moveY);
                        break;
                    case "down":
                        thiefMove(field, moveX + 1, moveY);
                        break;
                }
            }

        }
        if (!isInJail){
            System.out.println("Your last theft has finished successfully with " + money + "$ in your pocket.");
        }


        for (char[] chars : field) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }

    }
    public static void thiefMove(char[][] field, int moveX, int moveY){
        if(0 <= thiefX + moveX && thiefX + moveX < field.length && 0 <= thiefY + moveY && thiefY + moveY < field.length){
            isInField = true;
            field[thiefX][thiefY] = '+';
            thiefX = thiefX + moveX;
            thiefY = thiefY + moveY;
            if (field[thiefX][thiefY] == '$'){
                money = money + (thiefX * thiefY);
                System.out.println("You successfully stole " + (thiefX * thiefY) + "$.");
                field[thiefX][thiefY] = 'D';
            }else if (field[thiefX][thiefY] == 'P'){
                System.out.println("You got caught with " + money + "$, and you are going to jail.");
                isInJail = true;
                field[thiefX][thiefY] = '#';
            }else {
                field[thiefX][thiefY] = 'D';
            }

        } else {
            System.out.println("You cannot leave the town, there is police outside!");
            isInField = false;
        }

    }
}
