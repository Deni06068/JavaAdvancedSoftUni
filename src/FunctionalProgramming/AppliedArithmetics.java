package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] += 1;
                    }
                    break;
                case "multiply":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] * 2;
                    }
                    break;
                case "subtract":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] -= 1;
                    }
                    break;
                case "print":
                    for (int number : numbers) {
                        System.out.print(number + " ");
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
