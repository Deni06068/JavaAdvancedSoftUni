package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();
        ArrayDeque<String> textToBackUp = new ArrayDeque<>();
        int countOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countOfCommands; i++) {
            String[] input = scanner.nextLine().split(" ");
            int command = Integer.parseInt(input[0]);

            switch (command){
                case 1:
                    textToBackUp.push(text.toString());
                    text.append(input[1]);
                    break;
                case 2:
                    textToBackUp.push(text.toString());
                    text.delete((text.length() - Integer.parseInt(input[1])), text.length());
                    break;
                case 3:
                    System.out.println(text.charAt(Integer.parseInt(input[1]) - 1));
                    break;
                case 4:
                    text = new StringBuilder(textToBackUp.pop());
                    break;
            }
        }
    }
}
